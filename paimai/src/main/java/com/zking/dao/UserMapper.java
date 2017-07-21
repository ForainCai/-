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
    
    //通过username和password查找管理员
  	User findByUsernamePassword(User u);
  	
  	 //通过username和password查找管理员
    List<User> findAllUser();
    
  	public User findByUsernamePasswod(User u);
  	

}