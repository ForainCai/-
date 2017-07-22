package com.zking.enetity.customer;

import java.util.Date;

import com.zking.pojo.Goods;

public class buylist {
	private Integer buylistId;

	private Goods goods;

	private Double buylistPrice;

	private Integer buylistMan;

	private Date buylistStarttime;

	private Date buylistBuytime;

	private Date buylistEndtime;

	private Integer buylistOver;

	private Integer status;
	
	
	public buylist() {
		// TODO Auto-generated constructor stub
	}

	public buylist(Integer buylistId, Goods goods, Double buylistPrice, Integer buylistMan, Date buylistStarttime,
			Date buylistBuytime, Date buylistEndtime, Integer buylistOver, Integer status) {
		super();
		this.buylistId = buylistId;
		this.goods = goods;
		this.buylistPrice = buylistPrice;
		this.buylistMan = buylistMan;
		this.buylistStarttime = buylistStarttime;
		this.buylistBuytime = buylistBuytime;
		this.buylistEndtime = buylistEndtime;
		this.buylistOver = buylistOver;
		this.status = status;
	}

	public Integer getBuylistId() {
		return buylistId;
	}

	public void setBuylistId(Integer buylistId) {
		this.buylistId = buylistId;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Double getBuylistPrice() {
		return buylistPrice;
	}

	public void setBuylistPrice(Double buylistPrice) {
		this.buylistPrice = buylistPrice;
	}

	public Integer getBuylistMan() {
		return buylistMan;
	}

	public void setBuylistMan(Integer buylistMan) {
		this.buylistMan = buylistMan;
	}

	public Date getBuylistStarttime() {
		return buylistStarttime;
	}

	public void setBuylistStarttime(Date buylistStarttime) {
		this.buylistStarttime = buylistStarttime;
	}

	public Date getBuylistBuytime() {
		return buylistBuytime;
	}

	public void setBuylistBuytime(Date buylistBuytime) {
		this.buylistBuytime = buylistBuytime;
	}

	public Date getBuylistEndtime() {
		return buylistEndtime;
	}

	public void setBuylistEndtime(Date buylistEndtime) {
		this.buylistEndtime = buylistEndtime;
	}

	public Integer getBuylistOver() {
		return buylistOver;
	}

	public void setBuylistOver(Integer buylistOver) {
		this.buylistOver = buylistOver;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "buylist [buylistId=" + buylistId + ", goods=" + goods + ", buylistPrice=" + buylistPrice
				+ ", buylistMan=" + buylistMan + ", buylistStarttime=" + buylistStarttime + ", buylistBuytime="
				+ buylistBuytime + ", buylistEndtime=" + buylistEndtime + ", buylistOver=" + buylistOver + ", status="
				+ status + "]";
	}
	
}
