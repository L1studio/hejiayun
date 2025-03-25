package com.zlc.hjycommunity.system.service.impl;

import com.zlc.hjycommunity.system.domain.SysDept;
import com.zlc.hjycommunity.system.mapper.SysDeptMapper;
import com.zlc.hjycommunity.system.service.SysDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 17:13
 * @Description: com.zlc.hjycommunity.system.service.impl
 * @version: 1.0
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<SysDept> selectDeptList(SysDept dept) {
        List<SysDept> sysDepts = sysDeptMapper.selectDeptList(dept);
        return sysDepts;
    }
}
