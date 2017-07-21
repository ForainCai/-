package com.zking.dao;

import java.util.List;


import com.zking.enetity.admin.Goods;

public interface NewGoodsMapper {

	//查询所有物品	
	List<Goods> findAllGoods();
		
	//通过物品状态查询所有未审核物品
	List<Goods> findAllGoodsByGoodsStatus(String goods_status);
}
