package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class TerritoryCategoryBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory_category.category_id 分类id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory_category.category_name 分类名称
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory_category.territory_id 行业领域id
     *
     * @mbggenerated
     */
    private Integer territoryId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory_category.create_time 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * @author 吖彪快跑34
     *  fa_territory_category 领域分类表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}