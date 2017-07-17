package com.zking.dao;

import com.zking.pojo.GoodsType;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer goodstypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodstypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}