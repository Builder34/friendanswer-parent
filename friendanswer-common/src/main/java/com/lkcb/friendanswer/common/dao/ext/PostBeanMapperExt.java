package com.lkcb.friendanswer.common.dao.ext;

import com.lkcb.friendanswer.common.bean.TerritoryBean;
import com.lkcb.friendanswer.common.bean.TerritoryCategoryBean;
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
     * 查询用户所属领域
     * */
    List<TerritoryBean> getUserBelongTerritory(Integer userId) ;
    /**
     * 根据用户id、所选的领域id，查找其下的领域分类
     * @param params 参数集合；territoryId,userId
     * */
    List<TerritoryCategoryBean> getCircleTerritoryCategory(Map<String,Object> params) ;
    /**
     * 圈子-最新列表
     * @param params 参数集合；categoryId,typeId
     * */
    List<HomePageResult> getCircleLastList(Map<String,Object> params) ;
    /**
     * 圈子-收藏列表
     * @param params 参数集合；必填：userId，可选：typeId
     * */
    List<HomePageResult> getCircleFavorList(Map<String,Object> params) ;
    /**
     * 圈子-我的列表
     * @param params 参数集合；categoryId,typeId
     * */
    List<HomePageResult> getCircleSelfList(Map<String,Object> params) ;
}