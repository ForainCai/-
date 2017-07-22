package com.zking.dao;

import java.util.List;

import com.zking.enetity.customer.buylist;
import com.zking.pojo.Goods;

public interface CustomerBuyListMaper {
	
	public List<buylist> findAllBuyList(Goods good);
	
	public List<buylist> fidAllBuyListByType(Goods good);
	
	public List<buylist> findAllBuyListByPlace(Goods good);
}
