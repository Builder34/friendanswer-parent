package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.PostBean;

public interface PostBeanMapper {
    int deleteByPrimaryKey(Long postId);

    int insert(PostBean record);

    int insertSelective(PostBean record);

    PostBean selectByPrimaryKey(Long postId);

    int updateByPrimaryKeySelective(PostBean record);

    int updateByPrimaryKeyWithBLOBs(PostBean record);

    int updateByPrimaryKey(PostBean record);
}