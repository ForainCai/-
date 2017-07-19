package com.zking.pojo;


import java.sql.Timestamp;
import java.util.Date;

public class User {
    private Integer uid;

    private String username;

    private Integer usertype;

    private String name;

    private String password;

    private Timestamp regTime;

    private Integer userinfoId;

    private Integer usercreditId;

    private Integer userassetId;
    
    
    public User() {
		// TODO Auto-generated constructor stub
	}
    
    
	public User(Integer uid, String username, Integer usertype, String name, String password, Timestamp regTime,
			Integer userinfoId, Integer usercreditId, Integer userassetId) {
		super();
		this.uid = uid;
		this.username = username;
		this.usertype = usertype;
		this.name = name;
		this.password = password;
		this.regTime = regTime;
		this.userinfoId = userinfoId;
		this.usercreditId = usercreditId;
		this.userassetId = userassetId;
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

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
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

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getUsercreditId() {
        return usercreditId;
    }

    public void setUsercreditId(Integer usercreditId) {
        this.usercreditId = usercreditId;
    }

    public Integer getUserassetId() {
        return userassetId;
    }

    public void setUserassetId(Integer userassetId) {
        this.userassetId = userassetId;
    }
	@Override
	public String toString() {
		return "User1 [uid=" + uid + ", username=" + username + ", usertype=" + usertype + ", name=" + name
				+ ", password=" + password + ", regTime=" + regTime + ", userinfoId=" + userinfoId + ", usercreditId="
				+ usercreditId + ", userassetId=" + userassetId + "]";
	}    
    
}