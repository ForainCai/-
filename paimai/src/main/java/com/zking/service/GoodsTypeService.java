package com.zking.service;

import java.util.List;


import com.zking.pojo.GoodsType;

public interface GoodsTypeService {
	public List<GoodsType> findAllGoodsType() throws Exception;
	
	public void deleteGoodsType(int id) throws Exception;
	
	public void addGoodsType(GoodsType gt) throws Exception;
}
