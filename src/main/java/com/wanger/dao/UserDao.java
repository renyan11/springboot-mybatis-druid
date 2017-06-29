package com.wanger.dao;

import java.util.HashMap;
import java.util.List;

import com.wanger.domain.UserEntity;

public interface UserDao {

    public int deleteByPrimaryKey(String user_code);

    public int insertSelective(UserEntity record);

    public UserEntity selectByPrimaryKey(String user_code);

    public int updateByPrimaryKeySelective(UserEntity record);

    List<UserEntity> queryUser(HashMap map);
}