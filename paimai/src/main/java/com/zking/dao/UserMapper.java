package com.zking.dao;

import java.util.List;

import com.zking.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> findAllUser();
  	public User findByUsernamePasswod(User u);
}