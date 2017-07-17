package com.zking.pojo;

import java.util.Date;

public class UserAsset {
    private Integer userassetId;

    private Date userassetTime;

    private Integer userassetpeopleId;

    private Integer userassetLevel;

    public Integer getUserassetId() {
        return userassetId;
    }

    public void setUserassetId(Integer userassetId) {
        this.userassetId = userassetId;
    }

    public Date getUserassetTime() {
        return userassetTime;
    }

    public void setUserassetTime(Date userassetTime) {
        this.userassetTime = userassetTime;
    }

    public Integer getUserassetpeopleId() {
        return userassetpeopleId;
    }

    public void setUserassetpeopleId(Integer userassetpeopleId) {
        this.userassetpeopleId = userassetpeopleId;
    }

    public Integer getUserassetLevel() {
        return userassetLevel;
    }

    public void setUserassetLevel(Integer userassetLevel) {
        this.userassetLevel = userassetLevel;
    }
}