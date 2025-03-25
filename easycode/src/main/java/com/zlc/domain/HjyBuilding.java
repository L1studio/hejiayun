package com.zlc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 楼栋 
 * @TableName hjy_building
 */
@TableName(value ="hjy_building")
public class HjyBuilding {
    /**
     * 楼栋id
     */
    private Long buildingId;

    /**
     * 楼栋名称
     */
    private String buildingName;

    /**
     * 楼栋编码
     */
    private String buildingCode;

    /**
     * 楼栋面积
     */
    private BigDecimal buildingAcreage;

    /**
     * 小区id
     */
    private Long communityId;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 楼栋id
     */
    public Long getBuildingId() {
        return buildingId;
    }

    /**
     * 楼栋id
     */
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * 楼栋名称
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * 楼栋名称
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * 楼栋编码
     */
    public String getBuildingCode() {
        return buildingCode;
    }

    /**
     * 楼栋编码
     */
    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    /**
     * 楼栋面积
     */
    public BigDecimal getBuildingAcreage() {
        return buildingAcreage;
    }

    /**
     * 楼栋面积
     */
    public void setBuildingAcreage(BigDecimal buildingAcreage) {
        this.buildingAcreage = buildingAcreage;
    }

    /**
     * 小区id
     */
    public Long getCommunityId() {
        return communityId;
    }

    /**
     * 小区id
     */
    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    /**
     * 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HjyBuilding other = (HjyBuilding) that;
        return (this.getBuildingId() == null ? other.getBuildingId() == null : this.getBuildingId().equals(other.getBuildingId()))
            && (this.getBuildingName() == null ? other.getBuildingName() == null : this.getBuildingName().equals(other.getBuildingName()))
            && (this.getBuildingCode() == null ? other.getBuildingCode() == null : this.getBuildingCode().equals(other.getBuildingCode()))
            && (this.getBuildingAcreage() == null ? other.getBuildingAcreage() == null : this.getBuildingAcreage().equals(other.getBuildingAcreage()))
            && (this.getCommunityId() == null ? other.getCommunityId() == null : this.getCommunityId().equals(other.getCommunityId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBuildingId() == null) ? 0 : getBuildingId().hashCode());
        result = prime * result + ((getBuildingName() == null) ? 0 : getBuildingName().hashCode());
        result = prime * result + ((getBuildingCode() == null) ? 0 : getBuildingCode().hashCode());
        result = prime * result + ((getBuildingAcreage() == null) ? 0 : getBuildingAcreage().hashCode());
        result = prime * result + ((getCommunityId() == null) ? 0 : getCommunityId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buildingId=").append(buildingId);
        sb.append(", buildingName=").append(buildingName);
        sb.append(", buildingCode=").append(buildingCode);
        sb.append(", buildingAcreage=").append(buildingAcreage);
        sb.append(", communityId=").append(communityId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}