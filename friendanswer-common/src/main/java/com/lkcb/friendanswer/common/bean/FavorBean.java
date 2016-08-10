package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class FavorBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_favor.favor_id 点赞id
     *
     * @mbggenerated
     */
    private Long favorId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_favor.user_id 点赞人id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_favor.post_id 点赞帖子id
     *
     * @mbggenerated
     */
    private Long postId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_favor.creat_time 点赞时间
     *
     * @mbggenerated
     */
    private Date creatTime;

    /**
     * @author 吖彪快跑34
     *  fa_favor 点赞表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Long getFavorId() {
        return favorId;
    }

    public void setFavorId(Long favorId) {
        this.favorId = favorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}