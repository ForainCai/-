package com.zking.dao;

import java.util.List;

import com.zking.pojo.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

	List<City> findAllCity(int pid);
}