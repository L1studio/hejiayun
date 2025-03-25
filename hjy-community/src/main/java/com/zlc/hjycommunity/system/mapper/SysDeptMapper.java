package com.zlc.hjycommunity.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlc.hjycommunity.system.domain.SysDept;

import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 17:05
 * @Description: com.zlc.hjycommunity.system.mapper
 * @version: 1.0
 */
public interface SysDeptMapper  extends BaseMapper<SysDept>{
      /**
        * 查询部门管理数据
        * @param sysDept 
        * @return: java.util.List<com.msb.hjycommunity.system.domain.SysDept>
      */
      public List<SysDept> selectDeptList(SysDept sysDept);

}
