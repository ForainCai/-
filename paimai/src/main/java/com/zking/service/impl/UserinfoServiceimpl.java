package com.zking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.UserInfoMapper;
import com.zking.pojo.UserInfo;
import com.zking.service.UserinfoService;

@Service
public  class UserinfoServiceimpl implements UserinfoService{
	@Resource
	private UserInfoMapper userinfomapper;

	@Override
	public UserInfo findByAllUser(int userinfoid) {
	
		return userinfomapper.selectByPrimaryKey(userinfoid);
	}

	@Override
	public boolean upuserinfobyuserinfoid(int userinfoid) {
		int a=userinfomapper.upuserinfobyuserinfoid(userinfoid);
		if (a==0) {
			return false;
		}else {
			return true;
		}	
	}

}
