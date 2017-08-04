package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class UserBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.user_id 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.nick_name 用户昵称
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.real_name real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.avatar_url 头像url
     *
     * @mbggenerated
     */
    private String avatarUrl;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.phone_num phone_num
     *
     * @mbggenerated
     */
    private String phoneNum;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.regist_mode 注册方式：0-手机注册，1-微信授权注册，2-QQ授权注册，3-微博授权注册
     *
     * @mbggenerated
     */
    private Integer registMode;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.regist_time 注册时间
     *
     * @mbggenerated
     */
    private Date registTime;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.last_login_time 最近登录时间
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user.isOnline 是否在线；0-离线，1-在线
     *
     * @mbggenerated
     */
    private Integer isonline;

    /**
     * @author 吖彪快跑34
     *  fa_user 用户表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getRegistMode() {
        return registMode;
    }

    public void setRegistMode(Integer registMode) {
        this.registMode = registMode;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }
}