package com.zking.enetity.Paimai;

import com.zking.pojo.BuyList;
import com.zking.pojo.Goods;
import com.zking.pojo.GoodsType;

public class PaimaiGoodInfo {
	private BuyList buylist;
	private Goods good;
	private GoodsType goodstype;
	
	
	public PaimaiGoodInfo() {
		super();
	}
	
	public PaimaiGoodInfo(BuyList buylist, Goods good, GoodsType goodstype) {
		super();
		this.buylist = buylist;
		this.good = good;
		this.goodstype = goodstype;
	}

	public BuyList getBuylist() {
		return buylist;
	}

	public void setBuylist(BuyList buylist) {
		this.buylist = buylist;
	}

	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	public GoodsType getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}

	@Override
	public String toString() {
		return "PaimaiGoodInfo [buylist=" + buylist + ", good=" + good + ", goodstype=" + goodstype + "]";
	}
	
	
	
}
