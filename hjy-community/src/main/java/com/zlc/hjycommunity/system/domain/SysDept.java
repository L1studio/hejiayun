package com.zlc.hjycommunity.system.domain;

import com.zlc.hjycommunity.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 17:02
 * @Description: com.zlc.hjycommunity.system.domain
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysDept extends BaseEntity {
  private static final long serialVersionUID = -53187399711230185L;
  /**
    * 部门id
    */
          private Long deptId;
  /**
    * 父部门id
    */
          private Long parentId;
  /**
    * 添加一个父部门名称
    */
          private String parentName;
  /**
    * 添加一个子部门属性
    */
          private List<SysDept> children = new ArrayList<>();
  /**
    * 祖级列表
    */
          private String ancestors;
  /**
    * 部门名称
    */
          private String deptName;
  /**
    * 显示顺序
    */
          private Integer orderNum;
  /**
    * 负责人
    */
          private String leader;
  /**
    * 联系电话
    */
          private String phone;
  /**
    * 邮箱
    */
          private String email;
  /**
    * 部门状态（0正常 1停用）
    */
          private String status;
  /**
    * 删除标志（0代表存在 2代表删除）
    */
          private String delFlag;
}
