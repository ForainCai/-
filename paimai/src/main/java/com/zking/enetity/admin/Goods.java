package com.zking.enetity.admin;

import java.util.Arrays;

import com.zking.pojo.GoodsStatus;
import com.zking.pojo.GoodsType;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsPlace;

    private GoodsType goodstype;

    private User user;

    private String godsInfo;

    private String goodsPicture;
    
    private  GoodsStatus goodsstatus;
    public Goods() {
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer goodsId, String goodsName, Integer goodsPlace, GoodsType goodstype, User user, String godsInfo,
			String goodsPicture, GoodsStatus goodsstatus) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPlace = goodsPlace;
		this.goodstype = goodstype;
		this.user = user;
		this.godsInfo = godsInfo;
		this.goodsPicture = goodsPicture;
		this.goodsstatus = goodsstatus;
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
	public GoodsStatus getGoodsstatus() {
		return goodsstatus;
	}
	public void setGoodsstatus(GoodsStatus goodsstatus) {
		this.goodsstatus = goodsstatus;
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPlace=" + goodsPlace + ", goodstype="
				+ goodstype + ", user=" + user + ", godsInfo=" + godsInfo + ", goodsPicture=" + goodsPicture
				+ ", goodsstatus=" + goodsstatus + "]";
	}
    
    
}