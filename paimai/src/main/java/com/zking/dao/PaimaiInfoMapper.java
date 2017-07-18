package com.zking.dao;

import com.zking.pojo.PaimaiInfo;

public interface PaimaiInfoMapper {
    int deleteByPrimaryKey(Integer paiId);

    int insert(PaimaiInfo record);

    int insertSelective(PaimaiInfo record);

    PaimaiInfo selectByPrimaryKey(Integer paiId);

    int updateByPrimaryKeySelective(PaimaiInfo record);

    int updateByPrimaryKey(PaimaiInfo record);
}