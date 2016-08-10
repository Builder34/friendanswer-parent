package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.FavorBean;

public interface FavorBeanMapper {
    int deleteByPrimaryKey(Long favorId);

    int insert(FavorBean record);

    int insertSelective(FavorBean record);

    FavorBean selectByPrimaryKey(Long favorId);

    int updateByPrimaryKeySelective(FavorBean record);

    int updateByPrimaryKey(FavorBean record);
}