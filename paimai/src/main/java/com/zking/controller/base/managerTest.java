package com.zking.controller.base;

import com.zking.pojo.User;
import com.zking.service.impl.UserServiceimpl;

public class managerTest {
	public static void main(String[] args) {
			UserServiceimpl  u=new UserServiceimpl();
			User user=new User();
			user.setUsername("dfw");
			user.setPassword("123");
			user.setUsertype("1");
			System.out.println(u.findByUsernamePasswod(user));
	}
}
