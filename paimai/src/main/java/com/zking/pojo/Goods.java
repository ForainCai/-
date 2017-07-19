package com.zking.pojo;

import java.util.Arrays;

public class Goods {
    private Integer goods_id;

    private String goods_name;

    private String goods_place;

    private Integer goods_status;

    private String goods_info;

    private byte[] goods_picture;

    private GoodsType goodstype;

    private User user;

	public Integer getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_place() {
		return goods_place;
	}

	public void setGoods_place(String goods_place) {
		this.goods_place = goods_place;
	}

	public Integer getGoods_status() {
		return goods_status;
	}

	public void setGoods_status(Integer goods_status) {
		this.goods_status = goods_status;
	}

	public String getGoods_info() {
		return goods_info;
	}

	public void setGoods_info(String goods_info) {
		this.goods_info = goods_info;
	}

	public byte[] getGoods_picture() {
		return goods_picture;
	}

	public void setGoods_picture(byte[] goods_picture) {
		this.goods_picture = goods_picture;
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

	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_place=" + goods_place
				+ ", goods_status=" + goods_status + ", goods_info=" + goods_info + ", goods_picture="
				+ Arrays.toString(goods_picture) + ", goodstype=" + goodstype + ", user=" + user + "]";
	}
    
}