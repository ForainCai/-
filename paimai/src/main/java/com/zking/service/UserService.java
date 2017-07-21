package com.zking.service;

import java.util.List;


import com.zking.pojo.User;
import com.zking.pojo.UserInfo;

public interface UserService {
	//通过username和password查找管理员（dfw）
	public boolean findByUsernamePasswod(User u);
	//通过username和password查找管理员（dfw）
	public User findByUser(User u);
	//修改user信息（dfw）
	public boolean updateuser(User u);
	//修改user密码（dfw）
	public boolean updateuserpassword(User u);
	//通过uid查找user（dfw）
	public User findbyuid(int uid);
	
	public List<User> findAllUser() throws Exception;
}


