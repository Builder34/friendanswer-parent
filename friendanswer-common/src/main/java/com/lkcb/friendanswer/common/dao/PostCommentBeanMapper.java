package com.lkcb.friendanswer.common.dao;

import com.lkcb.friendanswer.common.bean.PostCommentBean;

public interface PostCommentBeanMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(PostCommentBean record);

    int insertSelective(PostCommentBean record);

    PostCommentBean selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(PostCommentBean record);

    int updateByPrimaryKeyWithBLOBs(PostCommentBean record);

    int updateByPrimaryKey(PostCommentBean record);
}