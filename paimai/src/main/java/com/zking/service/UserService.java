package com.zking.service;

import com.zking.pojo.User;

public interface UserService {
	//通过username和password查找管理员
	public boolean findByUsernamePasswod(User u);
}
