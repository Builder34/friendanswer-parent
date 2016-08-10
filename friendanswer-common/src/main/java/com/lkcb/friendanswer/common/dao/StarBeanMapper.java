package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.StarBean;

public interface StarBeanMapper {
    int deleteByPrimaryKey(Long starId);

    int insert(StarBean record);

    int insertSelective(StarBean record);

    StarBean selectByPrimaryKey(Long starId);

    int updateByPrimaryKeySelective(StarBean record);

    int updateByPrimaryKey(StarBean record);
}