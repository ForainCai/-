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
    
    //通过username和password查找管理员(dfw)
  	User findByUsernamePassword(User u);
  	
  	 //通过username和password查找管理员(dfw)
    List<User> findAllUser();
    
    //修改user信息（dfw）
	public int updateuser(User u);
	
	//修改user密码（dfw）
	public int updateuserpassword(User u);
	
	//通过uid查找user（dfw）
	public User findbyuid(int uid);
    
  	public User findByUsernamePasswod(User u);
  	
  	//前台修改pwd
  	int updateByusername (User u);
  	
  	//验证旧密码
  	User checkOldPwd(User u);
}