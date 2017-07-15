package com.zking.dao;

import com.zking.pojo.ButList;
import com.zking.pojo.ButListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ButListMapper {
    int countByExample(ButListExample example);

    int deleteByExample(ButListExample example);

    int deleteByPrimaryKey(Integer buylistId);

    int insert(ButList record);

    int insertSelective(ButList record);

    List<ButList> selectByExample(ButListExample example);

    ButList selectByPrimaryKey(Integer buylistId);

    int updateByExampleSelective(@Param("record") ButList record, @Param("example") ButListExample example);

    int updateByExample(@Param("record") ButList record, @Param("example") ButListExample example);

    int updateByPrimaryKeySelective(ButList record);

    int updateByPrimaryKey(ButList record);
}