package com.lkcb.friendanswer.provider.service;

import com.lkcb.friendanswer.api.IPostService;
import com.lkcb.friendanswer.common.bean.TerritoryBean;
import com.lkcb.friendanswer.common.bean.TerritoryCategoryBean;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.common.dao.ext.PostBeanMapperExt;
import com.lkcb.friendanswer.utils.MsgCode;
import com.lkcb.friendanswer.utils.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap ;

/**
 * Created by Builder34 on 2016/8/8.
 */
@Repository("postServiceImpl")
public class PostServiceImpl implements IPostService {
    private static Logger logger = LoggerFactory.getLogger(PostServiceImpl.class) ;
    @Autowired
    private PostBeanMapperExt postBeanMapperExt ;          //帖子表

    @Override
    public PageResult<List<TerritoryBean>> getUserBelongTerritory(Integer userId) {
        PageResult result = new PageResult();
        try {
            List<TerritoryBean> data = postBeanMapperExt.getUserBelongTerritory(userId);
            result.setCode(MsgCode.SUCCESS.getCode());
            result.setData(data);
            result.setTotalSize(data.size());
        }catch(Exception e){
            result.setCode(MsgCode.SERVER_ERROR.getCode());
            result.setErrorMsg(MsgCode.SERVER_ERROR.getMessage());
            result.setData("");
            logger.error("系统出错：",e);
        }
        return result ;
    }

    @Override
    public PageResult<Map<String,Object>> getCircleLastList(Map<String,Object> params) {
        PageResult result = new PageResult() ;
        try{
            List<HomePageResult> postData= postBeanMapperExt.getCircleLastList(params) ;
            Map<String,Object> dataMap = new HashMap<>() ;
            dataMap.put("postList",postData) ;
            boolean isIncludeCateMenu = params.get("isIncludeCateMenu")==null?false:(Boolean) params.get("isIncludeCateMenu") ;
            if(isIncludeCateMenu){
                dataMap.put("categoryMenu",postBeanMapperExt.getCircleTerritoryCategory(params)) ;
            }
            result.setData(dataMap);
            result.setCode(MsgCode.SUCCESS.getCode()) ;
            result.setTotalSize(postData.size());
        }catch (Exception e){
            result.setCode(MsgCode.SERVER_ERROR.getCode());
            result.setData("");
            result.setErrorMsg(MsgCode.SERVER_ERROR.getMessage());
            logger.error("系统错误：",e);
        }
        return result ;
    }

    @Override
    public PageResult<Map<String, Object>> getCircleStarList(Map<String, Object> params) {
        PageResult result = new PageResult() ;
        try{
            List<HomePageResult> postData= postBeanMapperExt.getCircleStarList(params) ;
            Map<String,Object> dataMap = new HashMap<>() ;
            dataMap.put("postList",postData) ;
            boolean isIncludeCateMenu = params.get("isIncludeCateMenu")==null?false:(Boolean) params.get("isIncludeCateMenu") ;
            if(isIncludeCateMenu){
                dataMap.put("categoryMenu",postBeanMapperExt.getCircleTerritoryCategory(params)) ;
            }
            result.setData(dataMap);
            result.setCode(MsgCode.SUCCESS.getCode()) ;
            result.setTotalSize(postData.size());
        }catch (Exception e){
            result.setCode(MsgCode.SERVER_ERROR.getCode());
            result.setData("");
            result.setErrorMsg(MsgCode.SERVER_ERROR.getMessage());
            logger.error("系统错误：",e);
        }
        return result ;
    }

    @Override
    public PageResult<Map<String, Object>> getCircleSelfList(Map<String, Object> params) {
        return null;
    }
}
