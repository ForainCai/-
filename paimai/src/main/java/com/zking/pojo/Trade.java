package com.zking.pojo;

import java.util.Date;

public class Trade {
    private Integer tradeId;

    private Integer tradeBuyId;

    private Integer goodsId;

    private Date tradeTime;

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getTradeBuyId() {
        return tradeBuyId;
    }

    public void setTradeBuyId(Integer tradeBuyId) {
        this.tradeBuyId = tradeBuyId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }
}