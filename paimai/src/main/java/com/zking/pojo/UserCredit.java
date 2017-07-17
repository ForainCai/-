package com.zking.pojo;

import java.util.Date;

public class UserCredit {
    private Integer usercreditId;

    private Date usercreditTime;

    private Integer usercreditpeopleId;

    private Integer usercreditLevel;

    public Integer getUsercreditId() {
        return usercreditId;
    }

    public void setUsercreditId(Integer usercreditId) {
        this.usercreditId = usercreditId;
    }

    public Date getUsercreditTime() {
        return usercreditTime;
    }

    public void setUsercreditTime(Date usercreditTime) {
        this.usercreditTime = usercreditTime;
    }

    public Integer getUsercreditpeopleId() {
        return usercreditpeopleId;
    }

    public void setUsercreditpeopleId(Integer usercreditpeopleId) {
        this.usercreditpeopleId = usercreditpeopleId;
    }

    public Integer getUsercreditLevel() {
        return usercreditLevel;
    }

    public void setUsercreditLevel(Integer usercreditLevel) {
        this.usercreditLevel = usercreditLevel;
    }
}