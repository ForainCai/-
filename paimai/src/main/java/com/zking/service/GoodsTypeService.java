package com.zking.service;

import java.util.List;


import com.zking.pojo.GoodsType;

public interface GoodsTypeService {
	public List<GoodsType> findAllGoodsType() throws Exception;
	
	public String deleteGoodsType(int id) throws Exception;
	
	public String addGoodsType(GoodsType gt) throws Exception;
}
