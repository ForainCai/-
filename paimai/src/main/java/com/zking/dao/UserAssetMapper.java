package com.zking.dao;

import com.zking.pojo.UserAsset;

public interface UserAssetMapper {
    int deleteByPrimaryKey(Integer userassetId);

    int insert(UserAsset record);

    int insertSelective(UserAsset record);

    UserAsset selectByPrimaryKey(Integer userassetId);

    int updateByPrimaryKeySelective(UserAsset record);

    int updateByPrimaryKey(UserAsset record);
}