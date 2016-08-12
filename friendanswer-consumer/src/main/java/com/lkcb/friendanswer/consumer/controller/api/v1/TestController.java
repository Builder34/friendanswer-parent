package com.lkcb.friendanswer.consumer.controller.api.v1;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lkcb.friendanswer.api.IPostService;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.consumer.constants.ApiVersionUrl;
import com.lkcb.friendanswer.consumer.constants.RESTfulUrlConstants;
import com.lkcb.friendanswer.utils.OperateResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Builder34 on 2016/8/10.
 */
@Controller
@RequestMapping(ApiVersionUrl.V1+ RESTfulUrlConstants.FIRST_CIRCLE)
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class) ;
    @Resource(name = "postServiceImpl")
    private IPostService postService ;

    @RequestMapping(path = "/homepage.do",method = RequestMethod.GET)
    public @ResponseBody String test(){
        Map<String,Integer> params = new HashMap<>() ;
        params.put("categoryId",1) ;
        params.put("typeId", 2) ;
        OperateResult<List<HomePageResult>> result= postService.getHomePageList(params) ;
        String str = JSONObject.toJSONString(result,true) ;
        JSONObject.toJSONStringWithDateFormat(result,"", SerializerFeature.PrettyFormat);
        logger.info(str);
        return str ;
    }
}
