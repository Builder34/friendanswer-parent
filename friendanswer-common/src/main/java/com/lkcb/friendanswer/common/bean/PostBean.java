package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class PostBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.post_id 帖子id
     *
     * @mbggenerated
     */
    private Long postId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.post_title 帖子标题
     *
     * @mbggenerated
     */
    private String postTitle;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.type_id 帖子类型；1-经历思考，2-经验知识，3-问答
     *
     * @mbggenerated
     */
    private Integer typeId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.category_id 领域分类id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.user_id 发帖人id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.heat_range 帖子热度
     *
     * @mbggenerated
     */
    private Integer heatRange;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.created_time 建立时间
     *
     * @mbggenerated
     */
    private Date createdTime;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.update_time 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post.post_content 帖子内容
     *
     * @mbggenerated
     */
    private String postContent;

    /**
     * @author 吖彪快跑34
     *  fa_post 帖子表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHeatRange() {
        return heatRange;
    }

    public void setHeatRange(Integer heatRange) {
        this.heatRange = heatRange;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}