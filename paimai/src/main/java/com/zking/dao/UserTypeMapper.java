package com.zking.dao;

import com.zking.pojo.UserType;

public interface UserTypeMapper {
    int deleteByPrimaryKey(Integer usertypeId);

    int insert(UserType record);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(Integer usertypeId);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}