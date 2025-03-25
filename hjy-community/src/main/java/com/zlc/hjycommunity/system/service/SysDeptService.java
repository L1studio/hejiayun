package com.zlc.hjycommunity.system.service;

import com.zlc.hjycommunity.system.domain.SysDept;

import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 17:13
 * @Description: com.zlc.hjycommunity.system.service
 * @version: 1.0
 */
public interface SysDeptService {

      public List<SysDept> selectDeptList(SysDept dept);
}
