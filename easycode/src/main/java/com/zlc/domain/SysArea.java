package com.zlc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 区域表
 * @TableName sys_area
 */
@TableName(value ="sys_area")
public class SysArea {
    /**
     * 唯一主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 城市编码
     */
    private Integer code;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 城市父ID
     */
    private Integer parentid;

    /**
     * 城市等级(0:省,1:市,2:县)
     */
    private Integer level;

    /**
     * 功能类型(1:角色认证地点开通;0:未开通)
     */
    private Integer type;

    /**
     * 服务状态
     */
    private Integer servicestate;

    /**
     * 逻辑删除 0正常 1 删除
     */
    private Integer deleteFlag;

    /**
     * 地区范围
     */
    private Integer region;

    /**
     * 唯一主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 唯一主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 城市编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 城市编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 城市名称
     */
    public String getName() {
        return name;
    }

    /**
     * 城市名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 城市父ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 城市父ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 城市等级(0:省,1:市,2:县)
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 城市等级(0:省,1:市,2:县)
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 功能类型(1:角色认证地点开通;0:未开通)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 功能类型(1:角色认证地点开通;0:未开通)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 服务状态
     */
    public Integer getServicestate() {
        return servicestate;
    }

    /**
     * 服务状态
     */
    public void setServicestate(Integer servicestate) {
        this.servicestate = servicestate;
    }

    /**
     * 逻辑删除 0正常 1 删除
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 逻辑删除 0正常 1 删除
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 地区范围
     */
    public Integer getRegion() {
        return region;
    }

    /**
     * 地区范围
     */
    public void setRegion(Integer region) {
        this.region = region;
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
        SysArea other = (SysArea) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getServicestate() == null ? other.getServicestate() == null : this.getServicestate().equals(other.getServicestate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getServicestate() == null) ? 0 : getServicestate().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", level=").append(level);
        sb.append(", type=").append(type);
        sb.append(", servicestate=").append(servicestate);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", region=").append(region);
        sb.append("]");
        return sb.toString();
    }
}