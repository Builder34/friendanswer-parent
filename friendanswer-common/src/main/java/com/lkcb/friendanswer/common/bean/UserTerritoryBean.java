package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class UserTerritoryBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_territory.user_tid 用户所属领域id
     *
     * @mbggenerated
     */
    private Integer userTid;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_territory.user_id 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_territory.category_id 领域分类id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_user_territory.create_time 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * @author 吖彪快跑34
     *  fa_user_territory 用户所属领域表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Integer getUserTid() {
        return userTid;
    }

    public void setUserTid(Integer userTid) {
        this.userTid = userTid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}