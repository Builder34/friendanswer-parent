package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class UserPwdBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_pwd.user_id 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_pwd.user_pwd 用户密码
     *
     * @mbggenerated
     */
    private String userPwd;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_pwd.access_token 访问令牌
     *
     * @mbggenerated
     */
    private String accessToken;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_pwd.token_create_time 令牌创建时间
     *
     * @mbggenerated
     */
    private Date tokenCreateTime;

    /**
     * @author 吖彪快跑34
     *  fa_user_pwd 用户密码表
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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getTokenCreateTime() {
        return tokenCreateTime;
    }

    public void setTokenCreateTime(Date tokenCreateTime) {
        this.tokenCreateTime = tokenCreateTime;
    }
}