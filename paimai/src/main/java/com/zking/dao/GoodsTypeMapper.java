package com.zking.dao;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import com.zking.pojo.GoodsType;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer goodstypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodstypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
    
    public List<GoodsType> findAllGoodsType();
    
    public int deleteGoodsType(int id) throws Exception;
    
	public void addGoodsType(GoodsType gt) throws Exception;
}