package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.UserMapper;
import com.zking.pojo.User;
import com.zking.service.UserService;
@Service("usi")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> findAllUser() {
		List<User> users = userMapper.findAllUser();
		return users;
	}

}
