package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.UserBean;

public interface UserBeanMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);
}