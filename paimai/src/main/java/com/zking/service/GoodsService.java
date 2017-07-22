package com.zking.service;

import java.util.List;

import com.zking.enetity.admin.Goods;

public interface GoodsService {
	public List<Goods> findAllGoods() throws Exception;
	
	public List<Goods> findAllGoodsByGoodsStatus(String goods_status) throws Exception;

public int customerInsertGoods(com.zking.pojo.Goods good);
}
