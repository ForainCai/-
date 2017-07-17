package com.zking.dao;

import com.zking.pojo.UserCredit;

public interface UserCreditMapper {
    int deleteByPrimaryKey(Integer usercreditId);

    int insert(UserCredit record);

    int insertSelective(UserCredit record);

    UserCredit selectByPrimaryKey(Integer usercreditId);

    int updateByPrimaryKeySelective(UserCredit record);

    int updateByPrimaryKey(UserCredit record);
}