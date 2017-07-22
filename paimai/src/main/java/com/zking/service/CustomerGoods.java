package com.zking.service;

import java.util.List;


import com.zking.enetity.customer.buylist;
import com.zking.pojo.Goods;

public interface CustomerGoods {
	public List<buylist> findAllBuyList(Goods good);
	
	
}
