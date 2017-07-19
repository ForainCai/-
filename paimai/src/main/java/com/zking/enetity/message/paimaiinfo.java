package com.zking.enetity.message;

public class paimaiinfo {
	private int buylist_id;//
	private int user_id;//用户id
	private int good_id;//商品编号
	private double money;//金额
	private int addmoney;//每次增加金额
	
	
	public paimaiinfo() {
		super();
	}
	public paimaiinfo(int buylist_id, int user_id, int good_id, double money, int addmoney) {
		super();
		this.buylist_id = buylist_id;
		this.user_id = user_id;
		this.good_id = good_id;
		this.money = money;
		this.addmoney = addmoney;
	}


	public int getBuylist_id() {
		return buylist_id;
	}


	public void setBuylist_id(int buylist_id) {
		this.buylist_id = buylist_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getGood_id() {
		return good_id;
	}


	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public int getAddmoney() {
		return addmoney;
	}


	public void setAddmoney(int addmoney) {
		this.addmoney = addmoney;
	}


	@Override
	public String toString() {
		return "paimaiinfo [buylist_id=" + buylist_id + ", user_id=" + user_id + ", good_id=" + good_id + ", money="
				+ money + ", addmoney=" + addmoney + "]";
	}
	
}
