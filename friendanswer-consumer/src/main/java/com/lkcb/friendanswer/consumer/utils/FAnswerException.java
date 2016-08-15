package com.lkcb.friendanswer.consumer.utils;

import java.util.HashMap;
import java.util.Map;



import com.alibaba.fastjson.JSON;
import com.lkcb.friendanswer.utils.MsgCode;

public class FAnswerException extends RuntimeException {

	private static final long serialVersionUID = 3022481503667660306L;
	
	private MsgCode msgCode;
	private String msg;
	private Object result;

	public FAnswerException(MsgCode msgCode) {
		this.msgCode = msgCode;
		this.msg = msgCode.getMessage();
	}

	public FAnswerException(MsgCode msgCode, String msg) {
		this.msgCode = msgCode;
		this.msg = msg;
	}
	
	public FAnswerException(MsgCode msgCode, String msg, Object result) {
		this.msgCode = msgCode;
		this.msg = msg;
		this.result = result;
	}

	public FAnswerException(MsgCode msgCode, Object result) {
		this.msgCode = msgCode;
		this.result = result;
	}
	


	public MsgCode getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(MsgCode msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	@Override
	public String getMessage() {

		Map<String,Object> obj = new HashMap<String,Object>();
		obj.put("msgCode", msgCode.getCode());

		if (msg != null) {
			obj.put("message", msg);
		} else {
			obj.put("message", msgCode.getMessage());
		}

		if (result != null) {
			obj.put("result", result);
		}
		
		return JSON.toJSONString(obj);
	}


	@Override
	public String toString() {
		return this.getMessage();
	}

}
