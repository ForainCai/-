package com.zking.pojo;

import java.util.Date;

public class ButList {
    private Integer buylistId;

    private Integer goodsId;

    private Double buylistPrice;

    private Integer buylistMan;

    private Date buylistStarttime;

    private Date buylistBuytime;

    private Date buylistEndtime;

    private Integer buylistOver;

    private Integer status;

    public Integer getBuylistId() {
        return buylistId;
    }

    public void setBuylistId(Integer buylistId) {
        this.buylistId = buylistId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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
}