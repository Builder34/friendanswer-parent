package com.lkcb.friendanswer.common.dao.ext;


import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.common.dao.PostBeanMapper;

import java.util.List;
import java.util.Map;

/**
 * @author Builder34
 * 帖子表Dao扩展
 * */
public interface PostBeanMapperExt extends PostBeanMapper {
    /**
     * @param params 参数集合；categoryId,typeId
     * */
    List<HomePageResult> getHomePageList(Map<String,Integer> params) ;
}