package com.lkcb.friendanswer.api;

import com.lkcb.friendanswer.common.bean.PostBean;
import com.lkcb.friendanswer.common.bean.TerritoryBean;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.common.service.BasicService;
import com.lkcb.friendanswer.utils.PageResult;

import java.util.List;
import java.util.Map;

/**
 * Created by Builder34 on 2016/8/8.
 * 帖子表Service
 */
public interface IPostService {
    /**
     * 查询用户所属领域
     * */
    PageResult<List<TerritoryBean>> getUserBelongTerritory(Integer userId) ;
    /**
     * 圈子-最新列表
     * @param params 输入参数
     * */
    PageResult<Map<String,Object>> getCircleLastList(Map<String,Object> params) ;
    /**
     * 圈子-收藏列表
     * */
    PageResult<Map<String,Object>> getCircleStarList(Map<String,Object> params) ;
    /**
     * 圈子-我的列表
     * */
    PageResult<Map<String,Object>> getCircleSelfList(Map<String,Object> params) ;


}
