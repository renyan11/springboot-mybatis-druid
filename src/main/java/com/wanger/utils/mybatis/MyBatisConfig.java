package com.wanger.utils.mybatis;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.github.pagehelper.PageHelper;

/**
 * springboot集成mybatis的基本入口 1）创建数据源 2）创建SqlSessionFactory
 */
@Configuration // 该注解类似于spring配置文件
@MapperScan(basePackages = "com.wanger.dao") // 扫描Dao文件
@EnableTransactionManagement //支持事务注解
public class MyBatisConfig implements TransactionManagementConfigurer {

	@Autowired
	private Environment env;// 配置文件

	@Autowired
    DataSource dataSource;//默认配置文件中的数据源
	/**
	 * 创建数据源 可以自己手动创建数据源, 也可以
	 * 
	 * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
	 */
	/*@Bean
	// @Primary
	public DataSource getDataSource() throws Exception {
		Properties props = new Properties();
		props.put("driverClassName", env.getProperty("spring.datasource.driverClassName"));
		props.put("url", env.getProperty("spring.datasource.url"));
		props.put("username", env.getProperty("spring.datasource.username"));
		props.put("password", env.getProperty("spring.datasource.password"));
		return DruidDataSourceFactory.createDataSource(props);
	}*/

	/**
	 * 根据数据源创建SqlSessionFactory
	 */
	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
		fb.setDataSource(dataSource);// 指定数据源(这个必须有，否则报错)
		// 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
		fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));// 指定基包
		
		//分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);

        //添加插件
        fb.setPlugins(new Interceptor[]{pageHelper});
		
		Resource[] resource = new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations"));
		fb.setMapperLocations(resource);// 指定xml文件位置
		return fb.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	@Bean
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}

}