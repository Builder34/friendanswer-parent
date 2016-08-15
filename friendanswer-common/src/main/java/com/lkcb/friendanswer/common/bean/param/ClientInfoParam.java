package com.lkcb.friendanswer.common.bean.param;

import java.io.Serializable;

/**
 * Created by Builder34 on 2016/8/14.
 * 客户端信息
 */
public class ClientInfoParam implements Serializable {
    private static final long serialVersionUID = -8546052011308036115L;

    private String ip ;           //ip地址
    private String deviceId ;     //设备id
    private String os ;           //操作系统：android , iOS
    private String osVersion ;    //操作系统版本
    private String appVersion ;   //app版本名称：1.0.0
    //private String versionCode ;//app版本内部编号
    private String accessToken ;  //登录令牌(凭证)

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
