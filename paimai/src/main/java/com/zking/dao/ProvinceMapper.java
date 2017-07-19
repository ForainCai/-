package com.zking.dao;

import java.util.List;

import com.zking.pojo.Province;

public interface ProvinceMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
    
    List<Province> findAllProvince();
}