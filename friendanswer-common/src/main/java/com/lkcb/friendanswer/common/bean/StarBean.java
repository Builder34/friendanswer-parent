package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class StarBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_star.star_id 收藏id
     *
     * @mbggenerated
     */
    private Long starId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_star.user_id 收藏人id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_star.post_id 帖子id
     *
     * @mbggenerated
     */
    private Long postId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_star.star_time 收藏时间
     *
     * @mbggenerated
     */
    private Date starTime;

    /**
     * @author 吖彪快跑34
     *  fa_star 收藏表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Long getStarId() {
        return starId;
    }

    public void setStarId(Long starId) {
        this.starId = starId;
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

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }
}