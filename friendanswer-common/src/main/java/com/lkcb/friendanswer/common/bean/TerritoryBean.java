package com.lkcb.friendanswer.common.bean;

import java.io.Serializable;
import java.util.Date;

public class TerritoryBean implements Serializable {
    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory.territory_id 领域id
     *
     * @mbggenerated
     */
    private Integer territoryId;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory.territory_name 领域名称
     *
     * @mbggenerated
     */
    private String territoryName;

    /**
     * @author 吖彪快跑34
     * This field corresponds to the database column fa_territory.create_time 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * @author 吖彪快跑34
     *  fa_territory 行业领域表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}