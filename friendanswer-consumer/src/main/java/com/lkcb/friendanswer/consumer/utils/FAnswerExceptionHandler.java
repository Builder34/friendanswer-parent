package com.lkcb.friendanswer.consumer.utils;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


public class FAnswerExceptionHandler implements HandlerExceptionResolver {

	private Logger log = LoggerFactory.getLogger(getClass());

	private String pageError = "/error/error";
	private String page500 = "/error/500";
	private String page404 = "/error/404";

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView mv = new ModelAndView(pageError);

		if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1))) {

			if (ex instanceof FAnswerException) {
				mv = new ModelAndView(page500);
				FAnswerException e = (FAnswerException) ex;
				String errorMsg = e.getMsg() + "，错误代码：" + e.getMsgCode().getCode();
				mv.addObject("errorMsg", errorMsg);
			} else {
				mv.addObject("errorMsg", "系统繁忙，请联系管理员！");
			}

		} else {// ajax请求格式返回
			try {
				OutputStreamWriter w = new OutputStreamWriter(response.getOutputStream(), Charset.forName("UTF-8"));
//				w.write(JsonUtil.generateResponse(MsgCode2.SYSTEM_ERROR) + w.getEncoding());
				w.flush();
				w.close();
			} catch (IOException e) {
				log.error("[error]", e);
			}
			return null;

		}

		log.error("[error]", ex);

		return mv;
	}

	public String getPageError() {
		return pageError;
	}

	public void setPageError(String pageError) {
		this.pageError = pageError;
	}

	public String getPage500() {
		return page500;
	}

	public void setPage500(String page500) {
		this.page500 = page500;
	}

	public String getPage404() {
		return page404;
	}

	public void setPage404(String page404) {
		this.page404 = page404;
	}

}
