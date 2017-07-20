package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.GoodsTypeMapper;
import com.zking.pojo.GoodsType;
import com.zking.service.GoodsTypeService;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
	@Resource
	private GoodsTypeMapper goodsTypeMapper;
	
	public GoodsTypeMapper getGoodsTypeMapper() {
		return goodsTypeMapper;
	}

	public void setGoodsTypeMapper(GoodsTypeMapper goodsTypeMapper) {
		this.goodsTypeMapper = goodsTypeMapper;
	}

	@Override
	public List<GoodsType> findAllGoodsType() throws Exception{
		List<GoodsType> gt = goodsTypeMapper.findAllGoodsType();
		return gt;
	}

	@Override
	public String deleteGoodsType(int id) throws Exception {
		System.out.println(id);
		goodsTypeMapper.deleteGoodsType(id);
		return "·µ»Ø";
	}

	@Override
	public String addGoodsType(GoodsType gt) throws Exception {
		goodsTypeMapper.addGoodsType(gt);
		return "·µ»Ø";
	}

}
