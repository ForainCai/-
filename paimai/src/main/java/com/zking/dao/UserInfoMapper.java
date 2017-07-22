package com.zking.dao;

import com.zking.pojo.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userinfoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userinfoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    //通过uid查找管理员所有信息(dfw)
  	public UserInfo findByAllUser(int  uid);
	//通过userinfoid查找管理员所有信息(dfw)
  	public int upuserinfobyuserinfoid(int userinfoid);
  	
  	//修改用户个人信息资料
  	int udInfo(UserInfo ui);
	//通过userinfoid查找管理员所有信息(dfw)
  	public int upuserinfo(UserInfo userinfo);
}