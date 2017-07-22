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
	public void deleteGoodsType(int id) throws Exception {
		goodsTypeMapper.deleteGoodsType(id);
	}

	@Override
	public void addGoodsType(GoodsType gt) throws Exception {
		goodsTypeMapper.addGoodsType(gt);
	}

}
