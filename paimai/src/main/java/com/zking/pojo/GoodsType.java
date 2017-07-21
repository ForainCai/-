package com.zking.pojo;

public class GoodsType {
    private Integer goodstype_id;

    private String goodstype_name;
    
    public GoodsType() {
		// TODO Auto-generated constructor stub
	}

	public GoodsType(Integer goodstype_id, String goodstype_name) {
		super();
		this.goodstype_id = goodstype_id;
		this.goodstype_name = goodstype_name;
	}

	public Integer getGoodstype_id() {
		return goodstype_id;
	}

	public void setGoodstype_id(Integer goodstype_id) {
		this.goodstype_id = goodstype_id;
	}

	public String getGoodstype_name() {
		return goodstype_name;
	}

	public void setGoodstype_name(String goodstype_name) {
		this.goodstype_name = goodstype_name;
	}

	@Override
	public String toString() {
		return "GoodsType [goodstype_id=" + goodstype_id + ", goodstype_name=" + goodstype_name + "]";
	}
	
	
	
	
	
	
}