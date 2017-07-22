package com.zking.dao;

import java.util.List;

import com.zking.enetity.admin.Count;
import com.zking.pojo.BuyList;

public interface BuyListMapper {
    int deleteByPrimaryKey(Integer buylistId);

    int insert(BuyList record);

    int insertSelective(BuyList record);

    BuyList selectByPrimaryKey(Integer buylistId);

    int updateByPrimaryKeySelective(BuyList record);

    int updateByPrimaryKey(BuyList record);
    
    //查询一天的成交量和成交金额（dfw）
    public Count findcount();
    //查询一天的交易数据（dfw）
    public List<Count> finddaycount();
    //查询一周的交易数据（dfw）
    public List<Count> findweekcount();
    //查询一月的交易数据（dfw）
    public List<Count> findmonthcount();
}