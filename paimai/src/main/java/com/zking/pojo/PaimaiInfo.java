package com.zking.pojo;

import java.util.Date;

public class PaimaiInfo {
    private Integer paiId;

    private Double money;

    private Integer uid;

    private Integer buylistId;

    private Date time;

    public PaimaiInfo() {
		super();
	}

	public PaimaiInfo( Double money, Integer uid, Integer buylistId) {
		super();
		this.money = money;
		this.uid = uid;
		this.buylistId = buylistId;
	}

	public Integer getPaiId() {
        return paiId;
    }

    public void setPaiId(Integer paiId) {
        this.paiId = paiId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBuylistId() {
        return buylistId;
    }

    public void setBuylistId(Integer buylistId) {
        this.buylistId = buylistId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}