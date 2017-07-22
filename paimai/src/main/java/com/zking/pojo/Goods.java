package com.zking.pojo;

import java.util.Arrays;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsPlace;

    private Integer goodstypeId;
    
    private double goodsprice;

    private Integer uid;

    private Integer goodsStatus;

    private String godsInfo;

    private String goodsPicture;
    
    
    public Goods() {
		// TODO Auto-generated constructor stub
	}
    
    
    

    public Goods(Integer goodsId, String goodsName, Integer goodsPlace, Integer goodstypeId, double goodsprice,
			Integer uid, Integer goodsStatus, String godsInfo, String goodsPicture) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPlace = goodsPlace;
		this.goodstypeId = goodstypeId;
		this.goodsprice = goodsprice;
		this.uid = uid;
		this.goodsStatus = goodsStatus;
		this.godsInfo = godsInfo;
		this.goodsPicture = goodsPicture;
	}




	public double getGoodsprice() {
		return goodsprice;
	}



	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
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

    public Integer getGoodstypeId() {
        return goodstypeId;
    }

    public void setGoodstypeId(Integer goodstypeId) {
        this.goodstypeId = goodstypeId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPlace=" + goodsPlace
				+ ", goodstypeId=" + goodstypeId + ", goodsprice=" + goodsprice + ", uid=" + uid + ", goodsStatus="
				+ goodsStatus + ", godsInfo=" + godsInfo + ", goodsPicture=" + goodsPicture + "]";
	}




    
    
    
    
    
    
}