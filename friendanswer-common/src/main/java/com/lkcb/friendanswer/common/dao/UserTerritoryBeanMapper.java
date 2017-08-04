package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.UserTerritoryBean;

public interface UserTerritoryBeanMapper {
    int deleteByPrimaryKey(Integer userTid);

    int insert(UserTerritoryBean record);

    int insertSelective(UserTerritoryBean record);

    UserTerritoryBean selectByPrimaryKey(Integer userTid);

    int updateByPrimaryKeySelective(UserTerritoryBean record);

    int updateByPrimaryKey(UserTerritoryBean record);
}