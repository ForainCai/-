package com.zking.enetity.admin;

import java.util.Arrays;

import com.zking.pojo.GoodsType;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsPlace;

    private GoodsType goodstype;

    private User user;

    private Integer goodsStatus;

    private String godsInfo;

    private String goodsPicture;
    
    
    public Goods() {
		// TODO Auto-generated constructor stub
	}
    
    


	public Integer getGoodsId() {
		return goodsId;
	}


	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}


	public String getGoodsName() {
		return goodsName;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public Integer getGoodsPlace() {
		return goodsPlace;
	}


	public void setGoodsPlace(Integer goodsPlace) {
		this.goodsPlace = goodsPlace;
	}


	public GoodsType getGoodstype() {
		return goodstype;
	}


	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Integer getGoodsStatus() {
		return goodsStatus;
	}


	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
	}


	public String getGodsInfo() {
		return godsInfo;
	}


	public void setGodsInfo(String godsInfo) {
		this.godsInfo = godsInfo;
	}


	public String getGoodsPicture() {
		return goodsPicture;
	}


	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}


	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPlace=" + goodsPlace + ", goodstype="
				+ goodstype + ", user=" + user + ", goodsStatus=" + goodsStatus + ", godsInfo=" + godsInfo
				+ ", goodsPicture=" + goodsPicture + "]";
	}


	public Goods(Integer goodsId, String goodsName, Integer goodsPlace, GoodsType goodstype, User user,
			Integer goodsStatus, String godsInfo, String goodsPicture) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPlace = goodsPlace;
		this.goodstype = goodstype;
		this.user = user;
		this.goodsStatus = goodsStatus;
		this.godsInfo = godsInfo;
		this.goodsPicture = goodsPicture;
	}
    
    
    
}