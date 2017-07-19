package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zking.dao.GoodsMapper;
import com.zking.dao.GoodsTypeMapper;
import com.zking.pojo.Goods;
import com.zking.pojo.GoodsType;
import com.zking.service.GoodsService;
@Service("gsi")
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	
	public GoodsMapper getGoodsMapper() {
		return goodsMapper;
	}

	public void setGoodsMapper(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	@Override
	public List<Goods> findAllGoods() throws Exception {
		List<Goods> goodss = goodsMapper.findAllGoods();
		System.out.println(goodss);
		return goodss;
	}

}
