package com.lkcb.friendanswer.api;

import com.lkcb.friendanswer.common.bean.PostBean;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.common.service.BasicService;
import com.lkcb.friendanswer.utils.OperateResult;

import java.util.List;
import java.util.Map;

/**
 * Created by Builder34 on 2016/8/8.
 * 帖子表Service
 */
public interface IPostService extends BasicService<PostBean> {
    /**
     * 首页列表查询
     * */
    OperateResult<List<HomePageResult>> getHomePageList(Map<String,Integer> params) ;
}
