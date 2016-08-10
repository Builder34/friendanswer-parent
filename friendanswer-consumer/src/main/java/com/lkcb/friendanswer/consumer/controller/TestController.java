package com.lkcb.friendanswer.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.lkcb.friendanswer.api.IPostService;
import com.lkcb.friendanswer.common.bean.result.HomePageResult;
import com.lkcb.friendanswer.utils.OperateResult;
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
@RequestMapping("/api")
public class TestController {
    @Resource(name = "postServiceImpl")
    private IPostService postService ;

    @RequestMapping(path = "/test.do",method = RequestMethod.GET)
    public @ResponseBody String test(){
        Map<String,Integer> params = new HashMap<>() ;
        params.put("categoryId",1) ;
        params.put("typeId", 2) ;
        OperateResult<List<HomePageResult>> result= postService.getHomePageList(params) ;
        return JSONObject.toJSONString(result) ;
    }
}
