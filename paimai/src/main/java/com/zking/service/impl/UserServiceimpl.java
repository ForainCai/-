package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.UserMapper;
import com.zking.pojo.User;
import com.zking.service.UserService;

@Service("userService")
public class UserServiceimpl implements UserService{
	@Resource 
	private UserMapper usermapper;
	
	public boolean findByUsernamePasswod(User u) {
		User user=usermapper.findByUsernamePassword(u);
		if (user!=null) {
			return true;
		}else {
			return false;	
		}	
	}

	@Override
	public User findByUser(User u) {
		User user = usermapper.findByUsernamePassword(u);
		return user;
	}
	public List<User> findAllUser() throws Exception {
		
		return usermapper.findAllUser();
	}

	@Override
	public boolean updateuser(User u) {
		int a=usermapper.updateuser(u);
		if (a==1) {
			return true;
		}else {			
			return false;
		}
	}

	@Override
	public boolean updateuserpassword(User u) {
		int a=usermapper.updateuserpassword(u);
		if (a==1) {
			return true;
		}else {			
			return false;
		}
	}

	@Override
	public User findbyuid(int uid) {
		User user=usermapper.findbyuid(uid);
		return user;
	}
}
