package com.zking.service;

import java.util.List;

import com.zking.pojo.Goods;

public interface GoodsService {
	public List<Goods> findAllGoods() throws Exception;
}
