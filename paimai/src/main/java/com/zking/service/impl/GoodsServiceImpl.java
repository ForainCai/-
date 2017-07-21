package com.zking.service.impl;

import java.util.List;




import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.GoodsMapper;
import com.zking.dao.NewGoodsMapper;
import com.zking.enetity.admin.Goods;
import com.zking.service.GoodsService;
@Service("gsi")
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	
	@Resource
	private NewGoodsMapper newGoodsMapper;
	public GoodsMapper getGoodsMapper() {
		return goodsMapper;
	}

	public void setGoodsMapper(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	@Override
	public List<Goods> findAllGoods() throws Exception {
		List<Goods> goodss = newGoodsMapper.findAllGoods();
		return goodss;
	}

	//用户上传商品信息
	public int customerInsertGoods(com.zking.pojo.Goods goods ) {
		return goodsMapper.insertGood(goods);
	}

}
