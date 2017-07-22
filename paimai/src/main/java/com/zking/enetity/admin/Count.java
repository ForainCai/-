package com.zking.enetity.admin;

import java.sql.Timestamp;

public class Count {
	private double allprice;
	private long allcount;
	private int  buylist_id;
	private String buyuername;
	private String goosname;
	private Timestamp buytime;
	private Double buyprice;
	private String saleuername;
	
	
	
	  
	public Count() {
		super();
	}
	public Count(double allprice, long allcount, int buylist_id, String buyuername, String goosname, Timestamp buytime,
			Double buyprice, String saleuername) {
		super();
		this.allprice = allprice;
		this.allcount = allcount;
		this.buylist_id = buylist_id;
		this.buyuername = buyuername;
		this.goosname = goosname;
		this.buytime = buytime;
		this.buyprice = buyprice;
		this.saleuername = saleuername;
	}
	public double getAllprice() {
		return allprice;
	}
	public void setAllprice(double allprice) {
		this.allprice = allprice;
	}
	public long getAllcount() {
		return allcount;
	}
	public void setAllcount(long allcount) {
		this.allcount = allcount;
	}
	public int getBuylist_id() {
		return buylist_id;
	}
	public void setBuylist_id(int buylist_id) {
		this.buylist_id = buylist_id;
	}
	public String getBuyuername() {
		return buyuername;
	}
	public void setBuyuername(String buyuername) {
		this.buyuername = buyuername;
	}
	public String getGoosname() {
		return goosname;
	}
	public void setGoosname(String goosname) {
		this.goosname = goosname;
	}
	public Timestamp getBuytime() {
		return buytime;
	}
	public void setBuytime(Timestamp buytime) {
		this.buytime = buytime;
	}
	public Double getBuyprice() {
		return buyprice;
	}
	public void setBuyprice(Double buyprice) {
		this.buyprice = buyprice;
	}
	public String getSaleuername() {
		return saleuername;
	}
	public void setSaleuername(String saleuername) {
		this.saleuername = saleuername;
	}
	
	
}
