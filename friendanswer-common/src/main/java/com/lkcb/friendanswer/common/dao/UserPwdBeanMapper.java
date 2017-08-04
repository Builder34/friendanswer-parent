package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.UserPwdBean;

public interface UserPwdBeanMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserPwdBean record);

    int insertSelective(UserPwdBean record);

    UserPwdBean selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserPwdBean record);

    int updateByPrimaryKey(UserPwdBean record);
}