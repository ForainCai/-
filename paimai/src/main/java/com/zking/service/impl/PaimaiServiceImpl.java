package com.zking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.BuyListMapper;
import com.zking.dao.GoodsMapper;
import com.zking.dao.GoodsTypeMapper;
import com.zking.enetity.Paimai.PaimaiGoodInfo;
import com.zking.pojo.BuyList;
import com.zking.pojo.Goods;
import com.zking.service.PaimaiService;
@Service("paimaiService")
public class PaimaiServiceImpl implements PaimaiService {
	@Resource
	private GoodsMapper goodsdao;
	@Resource
	private GoodsTypeMapper goodstypedao;
	@Resource
	private BuyListMapper buylistdao;
	@Override
	public PaimaiGoodInfo getGoodInfo(Integer buylist_id) throws NullPointerException{
		PaimaiGoodInfo message = new PaimaiGoodInfo();
		BuyList buylist = buylistdao.selectByPrimaryKey(buylist_id);
		Goods good = goodsdao.selectByPrimaryKey(buylist.getGoodsId());
		message.setBuylist(buylist);
		message.setGood(good);
		message.setGoodstype(goodstypedao.selectByPrimaryKey(good.getGoodstypeId()));
		return message;
	}

}
