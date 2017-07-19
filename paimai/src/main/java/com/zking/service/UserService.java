package com.zking.service;

import java.util.List;

import com.zking.pojo.User;

public interface UserService {
	public List<User> findAllUser() throws Exception;
}
