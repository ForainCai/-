package com.zking.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.zking.dao.UserMapper;
import com.zking.pojo.User;
import com.zking.service.UserService;

@Service("userservice")
public class UserServiceimpl implements UserService{
	
	@Resource 
	private UserMapper usermapper;
	
	public boolean findByUsernamePasswod(User u) {
		User user=usermapper.findByUsernamePasswod(u);
		if (user!=null) {
			return true;
		}else {
			return false;	
		}	
	}

}
