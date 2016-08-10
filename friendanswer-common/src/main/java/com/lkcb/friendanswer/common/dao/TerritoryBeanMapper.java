package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.TerritoryBean;

public interface TerritoryBeanMapper {
    int deleteByPrimaryKey(Integer territoryId);

    int insert(TerritoryBean record);

    int insertSelective(TerritoryBean record);

    TerritoryBean selectByPrimaryKey(Integer territoryId);

    int updateByPrimaryKeySelective(TerritoryBean record);

    int updateByPrimaryKey(TerritoryBean record);
}