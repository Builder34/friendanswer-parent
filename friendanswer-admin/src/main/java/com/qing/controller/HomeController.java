package com.qing.controller;

import com.qing.utils.constants.AdminVersionConstants;
import com.qing.utils.constants.RESTfulUrlConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Builder34 on 2017/1/11.
 */
@Controller
@RequestMapping(RESTfulUrlConstants.HOME)
public class HomeController {
    private static Logger logger = LoggerFactory.getLogger(HomeController.class) ;

    @RequestMapping(path = RESTfulUrlConstants.HOME_MAIN,method = RequestMethod.GET)
    public ModelAndView homeMain(){
        ModelAndView mv = new ModelAndView("main") ; // 跳转到页面:WEB-INF/pages/main.jsp
        return mv;
    }
}
