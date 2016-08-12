package com.lkcb;

import com.alibaba.fastjson.JSONObject;
import com.lkcb.friendanswer.provider.service.PostServiceImpl;
import com.lkcb.friendanswer.utils.OperateResult;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Builder34 on 2016/8/7.
 */
public class DubboProviderTest {

    public static PostServiceImpl postService ;
    @BeforeClass
    public static void setupBeforeClass() throws Exception{
        PropertyConfigurator.configure(PostServiceImpl.class.getResource("/config/dubbo_conf.properties"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml") ;
        postService = (PostServiceImpl)context.getBean("postServiceImpl") ;
        //context.close();
    }
    @Before
    public void setUp() throws Exception {}
    @After
    public void tearDown() throws Exception {}
    @Test
    public void getHomePageList(){
        Map<String,Integer> params = new HashMap<>() ;
        params.put("categoryId",1) ;
        params.put("typeId", 2) ;
        OperateResult result= postService.getHomePageList(params) ;
        System.out.println(JSONObject.toJSONString(result));
    }
}
