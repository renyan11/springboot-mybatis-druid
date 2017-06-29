package com.wanger.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanger.dao.UserDao;
import com.wanger.domain.UserEntity;
import com.wanger.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserEntity getUser(String userCode) {
		UserEntity user = userDao.selectByPrimaryKey(userCode);
		return user;
	}

	@Override
	public HashMap<String, Object> queryUser() {
		//分页处理，显示第一页的10条数据
        PageHelper.startPage(1, 10);
        List<UserEntity> list = userDao.queryUser(null);//查询
        // 取分页信息
        PageInfo<UserEntity> pageInfo = new PageInfo<UserEntity>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
		return map;
	}

}
