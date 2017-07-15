package com.zking.dao;

import com.zking.pojo.UserAsset;
import com.zking.pojo.UserAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAssetMapper {
    int countByExample(UserAssetExample example);

    int deleteByExample(UserAssetExample example);

    int deleteByPrimaryKey(Integer userassetId);

    int insert(UserAsset record);

    int insertSelective(UserAsset record);

    List<UserAsset> selectByExample(UserAssetExample example);

    UserAsset selectByPrimaryKey(Integer userassetId);

    int updateByExampleSelective(@Param("record") UserAsset record, @Param("example") UserAssetExample example);

    int updateByExample(@Param("record") UserAsset record, @Param("example") UserAssetExample example);

    int updateByPrimaryKeySelective(UserAsset record);

    int updateByPrimaryKey(UserAsset record);
}