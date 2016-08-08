package com.lkcb.friendanswer.utils;

/**
 * Created by Builder34 on 2016/8/8.
 * 操作结果类
 */
public class OperateResult<T> {
    private int success ;   //操作是否成功
    private String errorMsg ;  //错误信息
    private T data ;   //结果JSON字符串数据
    public static final int SUCCESS = 1 ; //操作成功
    public static final int FAIL = 0 ;   //操作失败
    public static final String ERROR_SYS = "系统内部出错" ;

    public int getSuccess() {
        return success;
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

    public void setSuccess(int success) {
        this.success = success;
    }

    public void setData(T data) {
        this.data = data;
    }
}
