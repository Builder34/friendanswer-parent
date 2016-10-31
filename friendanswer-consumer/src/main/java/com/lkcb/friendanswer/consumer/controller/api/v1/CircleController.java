package com.lkcb.friendanswer.consumer.controller.api.v1;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lkcb.friendanswer.api.IPostService;
import com.lkcb.friendanswer.common.bean.TerritoryBean;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.consumer.constants.ApiVersionUrl;
import com.lkcb.friendanswer.consumer.constants.RESTfulUrlConstants;
import com.lkcb.friendanswer.utils.MsgCode;
import com.lkcb.friendanswer.utils.PageResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Builder34 on 2016/8/14.
 * 圈子tab 接口
 */
@Controller
@RequestMapping(ApiVersionUrl.V1+ RESTfulUrlConstants.FIRST_CIRCLE)
public class CircleController {
    private static Logger logger = LoggerFactory.getLogger(CircleController.class) ;

    @Resource(name = "postServiceImpl")
    private IPostService postService ;
    /**
     * 领域列表
     * */
    @RequestMapping(path = RESTfulUrlConstants.SECOND_TERRITORYLIST , method = RequestMethod.POST)
    public @ResponseBody String territoryList(@RequestBody(required = false) String requestBodyJson,HttpServletRequest request){
        String paramsStr = requestBodyJson==null?"{}":requestBodyJson ;
        Map<String,Object> params = (Map<String,Object>)JSON.parseObject(paramsStr,Map.class) ;
        PageResult<List<TerritoryBean>> result  ;
        if(null != params.get("userId")) {
            result = postService.getUserBelongTerritory(Integer.parseInt(String.valueOf(params.get("userId"))));
        }else{
            result = new PageResult<>() ;
            result.setCode(MsgCode.MISS_PARAM.getCode());
            result.setErrorMsg(MsgCode.MISS_PARAM.getMessage()+": userId");
        }
        String resultJsonString = JSONObject.toJSONString(result, SerializerFeature.PrettyFormat);
        return resultJsonString;
    }
    /**
     * 最新列表
     * */
    @RequestMapping(path = RESTfulUrlConstants.SECOND_LASTLIST , method = RequestMethod.POST)
    public @ResponseBody String lastList(@RequestBody(required = false) String requestBodyJson){
        Map<String,Object> params = (Map<String,Object>)JSON.parseObject(requestBodyJson,Map.class) ;
        PageResult<Map<String,Object>> result = postService.getCircleLastList(params) ;
        List<HomePageResult> postList = (List<HomePageResult>)result.getData().get("postList") ;
        PageResult<List<HomePageResult>> postListResult = new PageResult<>() ;
        postListResult.setTotalSize(postList.size());
        postListResult.setCode(result.getCode());
        postListResult.setData(postList);
        String resultJsonString = JSONObject.toJSONStringWithDateFormat(postListResult,"yyyyMMddHHmmss", SerializerFeature.PrettyFormat);
        return resultJsonString ;
    }
    /**
     * 收藏列表
     * */
    @RequestMapping(path = RESTfulUrlConstants.SECOND_STARLIST , method = RequestMethod.POST)
    public @ResponseBody String starList(@RequestBody(required = false) String requestBodyJson){
        Map<String,Object> params = (Map<String,Object>)JSON.parseObject(requestBodyJson,Map.class) ;
        PageResult<Map<String,Object>> result = postService.getCircleStarList(params) ;
        String resultJsonString = JSONObject.toJSONStringWithDateFormat(result,"yyyyMMddHHmmss", SerializerFeature.PrettyFormat);
        return resultJsonString ;
    }
    /**
     * 我的列表
     * */
    @RequestMapping(path = RESTfulUrlConstants.SECOND_SELFLIST , method = RequestMethod.POST)
    public @ResponseBody String selfList(@RequestBody(required = false) String requestBodyJson){
        Map<String,Object> params = (Map<String,Object>)JSON.parseObject(requestBodyJson,Map.class) ;
        PageResult<Map<String,Object>> result = postService.getCircleSelfList(params) ;
        String resultJsonString = JSONObject.toJSONStringWithDateFormat(result,"yyyyMMddHHmmss", SerializerFeature.PrettyFormat);
        return resultJsonString ;
    }
}
