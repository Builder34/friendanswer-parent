package com.lkcb.friendanswer.provider.service;

import com.lkcb.friendanswer.api.IPostService;
import com.lkcb.friendanswer.common.bean.PostBean;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.common.dao.FavorBeanMapper;
import com.lkcb.friendanswer.common.dao.PostCommentBeanMapper;
import com.lkcb.friendanswer.common.dao.StarBeanMapper;
import com.lkcb.friendanswer.common.dao.ext.PostBeanMapperExt;
import com.lkcb.friendanswer.utils.OperateResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Builder34 on 2016/8/8.
 */
@Repository("postServiceImpl")
public class PostServiceImpl implements IPostService {
    private static Logger logger = LoggerFactory.getLogger(PostServiceImpl.class) ;
    @Autowired
    private PostBeanMapperExt postBeanMapperExt ;          //帖子表
    @Autowired
    private PostCommentBeanMapper postCommentBeanMapper ;  //评论表
    @Autowired
    private FavorBeanMapper favorBeanMapper ;              //点赞表
    @Autowired
    private StarBeanMapper starBeanMapper ;                //收藏表

    @Override
    public int deleteByPrimaryKey(Long favorId)  {
        return 0;
    }

    @Override
    public int insert(PostBean record)  {
        return 0;
    }

    @Override
    public int insertSelective(PostBean record) {
        return 0;
    }

    @Override
    public PostBean selectByPrimaryKey(Long favorId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(PostBean record) {
        return 0;
    }

    @Override
    public OperateResult<List<HomePageResult>> getHomePageList(Map<String,Integer> params) {
        OperateResult result = new OperateResult() ;
        try{
            List<HomePageResult> data= postBeanMapperExt.getHomePageList(params) ;
            result.setSuccess(OperateResult.SUCCESS) ;
            result.setData(data);
        }catch (Exception e){
            result.setSuccess(OperateResult.FAIL);
            result.setData("");
            result.setErrorMsg(OperateResult.ERROR_SYS);
            logger.error("系统错误：",e);
        }
        return result ;
    }

    @Override
    public int updateByPrimaryKey(PostBean record) {
        return 0;
    }
}
