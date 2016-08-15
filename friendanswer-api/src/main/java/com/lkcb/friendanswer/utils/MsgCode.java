package com.lkcb.friendanswer.utils;

/**
 * Created by Builder34 on 2016/8/5.
 * 请求响应码
 */
public enum MsgCode {
    SUCCESS(0,"success"),
    REQUEST_URLFAIL(100,"请求URL错误"),
    MISS_APPKEY(101,"缺少appKey"),
    MISS_PARAM(102,"缺少参数"),
    SERVER_ERROR(500,"服务器出错"),
    SERVER_RESTARTING(501,"服务器正在重启")
    ;

    private int code ;    //响应码
    private String message ; //描述信息

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    MsgCode(int code , String message){
        this.setCode(code);
        this.setMessage(message);
    }
}
