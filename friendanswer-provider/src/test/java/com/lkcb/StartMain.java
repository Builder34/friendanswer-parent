package com.lkcb;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Builder34 on 2016/8/11.
 */
public class StartMain {
    public static void main(String[] args) throws Exception{
        PropertyConfigurator.configure(StartMain.class.getResource("/configs/dubbo_conf/log4j.properties"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
            "applicationContext-test.xml"
        }) ;
        context.start();
        System.out.println("Spring启动成功！");
        System.in.read();
    }
}
