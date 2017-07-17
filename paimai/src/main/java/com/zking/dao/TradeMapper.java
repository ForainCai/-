package com.zking.dao;

import com.zking.pojo.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Integer tradeId);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Integer tradeId);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}