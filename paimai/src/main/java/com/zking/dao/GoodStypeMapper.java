package com.zking.dao;

import com.zking.pojo.GoodStype;
import com.zking.pojo.GoodStypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodStypeMapper {
    int countByExample(GoodStypeExample example);

    int deleteByExample(GoodStypeExample example);

    int deleteByPrimaryKey(Integer goodstypeId);

    int insert(GoodStype record);

    int insertSelective(GoodStype record);

    List<GoodStype> selectByExample(GoodStypeExample example);

    GoodStype selectByPrimaryKey(Integer goodstypeId);

    int updateByExampleSelective(@Param("record") GoodStype record, @Param("example") GoodStypeExample example);

    int updateByExample(@Param("record") GoodStype record, @Param("example") GoodStypeExample example);

    int updateByPrimaryKeySelective(GoodStype record);

    int updateByPrimaryKey(GoodStype record);
}