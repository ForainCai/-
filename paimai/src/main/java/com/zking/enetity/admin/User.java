package com.zking.enetity.admin;

import java.sql.Timestamp;

import java.util.Date;

import com.zking.pojo.UserAsset;
import com.zking.pojo.UserCredit;
import com.zking.pojo.UserInfo;
import com.zking.pojo.UserType;

public class User {
    private Integer uid;

    private String username;

    private UserType usertype;

    private String name;

    private String password;

    private Timestamp regTime;

	private UserInfo userinfo;
	
	private UserAsset userasset;
	
	private UserCredit usercredit;
	
	
	public User() {
		super();
	}

	public User(Integer uid, String username, UserType usertype, String name, String password, Timestamp regTime,
			UserInfo userinfo, UserAsset userasset, UserCredit usercredit) {
		super();
		this.uid = uid;
		this.username = username;
		this.usertype = usertype;
		this.name = name;
		this.password = password;
		this.regTime = regTime;
		this.userinfo = userinfo;
		this.userasset = userasset;
		this.usercredit = usercredit;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserType getUsertype() {
		return usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegTime() {
		return regTime;
	}

	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public UserAsset getUserasset() {
		return userasset;
	}

	public void setUserasset(UserAsset userasset) {
		this.userasset = userasset;
	}

	public UserCredit getUsercredit() {
		return usercredit;
	}

	public void setUsercredit(UserCredit usercredit) {
		this.usercredit = usercredit;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", usertype=" + usertype + ", name=" + name
				+ ", password=" + password + ", regTime=" + regTime + ", userinfo=" + userinfo + ", userasset="
				+ userasset + ", usercredit=" + usercredit  + "]";
	}
	
	
}