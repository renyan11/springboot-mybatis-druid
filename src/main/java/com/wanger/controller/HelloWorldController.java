package com.wanger.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanger.domain.UserEntity;
import com.wanger.service.UserService;

@RestController
public class HelloWorldController {

	@Autowired
	UserService UserService;
	
	@RequestMapping("/hello")
	public String index() {
		HashMap<String, Object>  map = UserService.queryUser();
		System.out.println(map.get("total"));
		return "Hello World";
	}
	
	
	@RequestMapping("/hello1")
	public String findUser(String userCode){
		UserEntity user =  UserService.getUser(userCode);
		return user.getName();
	}
}
