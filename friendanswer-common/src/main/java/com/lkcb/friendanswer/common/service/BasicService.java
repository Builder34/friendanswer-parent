package com.lkcb.friendanswer.common.service;


/**
 * Created by Builder34 on 2016/8/5.
 * 基础service
 */
public interface BasicService<T> {
    int deleteByPrimaryKey(Long favorId) ;

    int insert(T record) ;

    int insertSelective(T record) ;

    T selectByPrimaryKey(Long favorId) ;

    int updateByPrimaryKeySelective(T record) ;

    int updateByPrimaryKey(T record) ;
}
