package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName UserEntity
 * @Description 用户信息表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class UserEntity {

    //用户代码
    private String user_code;
    //用户ID
    private String username;
    //用户密码
    private String password;
    //机构ID
    private String org_code;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //出生日期
    private String birthday;
    //创建时间
    private Date create_time;
    //修改时间
    private Date modify_time;
    //是否删除
    private Integer is_del;

    public String getUser_code() {
        return user_code;
    }
    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getOrg_code() {
        return org_code;
    }
    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public Date getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public Date getModify_time() {
        return modify_time;
    }
    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
    public Integer getIs_del() {
        return is_del;
    }
    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }

}