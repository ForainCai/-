package com.zking.service;

import com.zking.pojo.User;
import com.zking.pojo.UserInfo;

public interface UserService {
	//通过username和password查找管理员
	public boolean findByUsernamePasswod(User u);
	//通过username和password查找管理员
	public User findByUser(User u);
}
