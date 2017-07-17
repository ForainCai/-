package com.zking.pojo;

import java.util.Date;

public class User {
    private Integer uid;

    private String username;

    private String usertype;

    private String name;

    private String password;

    private Date regTime;

    private Integer userinfoId;

    private Integer usercreditId;

    private Integer userassetId;

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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
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

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
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
}