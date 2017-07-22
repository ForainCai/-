package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.zking.dao.CustomerBuyListMaper;
import com.zking.enetity.customer.buylist;
import com.zking.pojo.Goods;
import com.zking.service.CustomerGoods;

@Service
public class CustomerGoodsImpl implements CustomerGoods {

	@Resource
	private CustomerBuyListMaper customerBuyListMaper;
	
	public List<buylist> findAllBuyList(Goods good) {
		if(good.getGoodsPlace()==0){
			return customerBuyListMaper.fidAllBuyListByType(good);
		}else if(good.getGoodstypeId()==0){
			return customerBuyListMaper.findAllBuyListByPlace(good);
		}else{
			
			return customerBuyListMaper.findAllBuyList(good);
			
		}
		
		
	}
	
	

}
