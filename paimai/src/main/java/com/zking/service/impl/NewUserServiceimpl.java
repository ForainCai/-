package com.zking.service.impl;

import java.util.List;






import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.NewGoodsMapper;
import com.zking.dao.NewUserMapper;
import com.zking.enetity.admin.Goods;
import com.zking.enetity.admin.User;
import com.zking.service.NewUserService;

@Service("nusi")
public class NewUserServiceimpl implements NewUserService{
	@Resource 
	private NewUserMapper newUserMapper;
	@Resource 
	private NewGoodsMapper newGoodsMapper;
	public List<User> findAllUser() throws Exception {
		List<User> users = newUserMapper.findAllUser();
		return users;
	}

}
