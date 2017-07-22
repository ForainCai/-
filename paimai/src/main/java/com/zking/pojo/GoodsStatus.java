package com.zking.pojo;

public class GoodsStatus {
    private Integer goodsstatus_id;

    private String goodsstatus_name;
    
    public GoodsStatus() {
		// TODO Auto-generated constructor stub
	}

	public GoodsStatus(Integer goodsstatus_id, String goodsstatus_name) {
		super();
		this.goodsstatus_id = goodsstatus_id;
		this.goodsstatus_name = goodsstatus_name;
	}

	public Integer getGoodsstatus_id() {
		return goodsstatus_id;
	}

	public void setGoodsstatus_id(Integer goodsstatus_id) {
		this.goodsstatus_id = goodsstatus_id;
	}

	public String getGoodsstatus_name() {
		return goodsstatus_name;
	}

	public void setGoodsstatus_name(String goodsstatus_name) {
		this.goodsstatus_name = goodsstatus_name;
	}

	@Override
	public String toString() {
		return "GoodsStatus [goodsstatus_id=" + goodsstatus_id + ", goodsstatus_name=" + goodsstatus_name + "]";
	}

	
}