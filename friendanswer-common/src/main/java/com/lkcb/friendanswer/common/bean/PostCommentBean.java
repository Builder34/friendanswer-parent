package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class PostCommentBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post_comment.comment_id 评论id
     *
     * @mbggenerated
     */
    private Long commentId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post_comment.previous_id 上一级评论id
     *
     * @mbggenerated
     */
    private Long previousId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post_comment.post_id 帖子id
     *
     * @mbggenerated
     */
    private Long postId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post_comment.user_id 评论人id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post_comment.comment_time 评论时间
     *
     * @mbggenerated
     */
    private Date commentTime;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_post_comment.comment_content 评论内容
     *
     * @mbggenerated
     */
    private String commentContent;

    /**
     * @author 吖彪快跑34
     *  fa_post_comment 帖子评论表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Long previousId) {
        this.previousId = previousId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}