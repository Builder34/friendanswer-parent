package com.manman.datasource;

/**
 * Created by Builder34 on 2017/3/29.
 */
public class DataSourceSwitcherToken {
    public static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static void putToken(String name){
        token.set(name);
    }
    public static String getToken(){
        return token.get();
    }
    public static void relaxToken(){
        token.remove();
    }
}
