package com.zking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.UserMapper;
import com.zking.pojo.User;
import com.zking.service.Demo;
@Service("Demo")
public class DemoImpl implements Demo {
	@Resource
	private UserMapper userdao;
	@Override
	public User test(User u) {
		return userdao.selectByPrimaryKey(u.getUid());
	}

}
