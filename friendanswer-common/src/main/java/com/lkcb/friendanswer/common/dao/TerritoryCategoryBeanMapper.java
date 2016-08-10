package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.TerritoryCategoryBean;

public interface TerritoryCategoryBeanMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(TerritoryCategoryBean record);

    int insertSelective(TerritoryCategoryBean record);

    TerritoryCategoryBean selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(TerritoryCategoryBean record);

    int updateByPrimaryKey(TerritoryCategoryBean record);
}