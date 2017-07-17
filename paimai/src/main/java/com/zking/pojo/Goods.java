package com.zking.pojo;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private String goodsPlace;

    private Integer goodstypeId;

    private Integer uid;

    private Integer goodsStatus;

    private String godsInfo;

    private byte[] goodsPicture;

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

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
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

    public byte[] getGoodsPicture() {
        return goodsPicture;
    }

    public void setGoodsPicture(byte[] goodsPicture) {
        this.goodsPicture = goodsPicture;
    }
}