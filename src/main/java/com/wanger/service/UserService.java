package com.wanger.service;

import java.util.HashMap;

import com.wanger.domain.UserEntity;

public interface UserService {

	UserEntity getUser(String userCode);
	
	HashMap<String, Object> queryUser();
}
