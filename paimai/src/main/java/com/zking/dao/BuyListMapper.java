package com.zking.dao;

import com.zking.pojo.BuyList;

public interface BuyListMapper {
    int deleteByPrimaryKey(Integer buylistId);

    int insert(BuyList record);

    int insertSelective(BuyList record);

    BuyList selectByPrimaryKey(Integer buylistId);

    int updateByPrimaryKeySelective(BuyList record);

    int updateByPrimaryKey(BuyList record);
}