package com.lkcb.friendanswer.utils;

import java.io.Serializable;

/**
 * Created by Builder34 on 2016/8/8.
 * 操作结果类
 */
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = 4741732279428546039L;

    private int code ;   //接口响应码
    private String errorMsg ;  //错误信息
    private T data ;   //结果JSON字符串数据
    private int totalSize ; //结果集总数

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }
}
