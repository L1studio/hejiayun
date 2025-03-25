package com.zlc.hjycommunity.common.core.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 基础实体类：所有业务实体类的基类，定义通用字段和公共属性
 * 实现 Serializable 接口以支持序列化（如缓存、网络传输等）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable {

    // 序列化版本号，用于反序列化时验证版本一致性
    private static final long serialVersionUID = -351421151047026877L;

    /**
     * 搜索值（非数据库字段）
     * @TableField(exist = false)：标记该字段不与数据库表列映射
     * 用途：前端搜索时传递的额外参数（如模糊查询关键字）
     */
    @TableField(exist = false)
    private String searchValue;

    /**
     * 创建人
     * @TableField(fill = FieldFill.INSERT)：插入记录时自动填充该字段
     * 实现方式：需配置 MyBatis-Plus 的 MetaObjectHandler 处理填充逻辑
     */
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     * @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")：序列化/反序列化时使用指定日期格式
     * @TableField(fill = FieldFill.INSERT)：插入记录时自动填充
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新人（注意：此处填充策略应为 FieldFill.INSERT_UPDATE）
     * @TableField(fill = FieldFill.INSERT)：仅插入时填充（实际业务中通常需要更新时也填充）
     */
    @TableField(fill = FieldFill.INSERT)
    private String updateBy;

    /**
     * 更新时间
     * @JsonFormat 与 @TableField 同上
     * 问题：填充策略应为 FieldFill.INSERT_UPDATE（当前配置可能不符合实际需求）
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date updateTime;

    /**
     * 备注（普通数据库字段）
     */
    private String remark;

    /**
     * 请求参数容器（非数据库字段）
     * 用途：接收前端请求中的动态参数（如过滤条件）
     */
    @TableField(exist = false)
    private Map<String, Object> params;

}