package com.lkcb.friendanswer.common.bean.result;

/**
 * Created by Builder34 on 2016/8/8.
 * 首页单行数据Bean
 */
public class HomePageResult {
    private long postId ; //帖子id
    private String title ;        //标题
    private String description ;  //正文简述
    private int favorCount ;      //点赞数
    private int commentCount ;    //评论数
    private int starCount ;       //收藏数

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getFavorCount() {
        return favorCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getStarCount() {
        return starCount;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFavorCount(int favorCount) {
        this.favorCount = favorCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }
}
