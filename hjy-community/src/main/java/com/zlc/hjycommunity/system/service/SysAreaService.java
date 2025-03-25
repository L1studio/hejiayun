package com.zlc.hjycommunity.system.service;

import com.zlc.hjycommunity.system.domain.dto.SysAreaDto;
import com.zlc.hjycommunity.system.mapper.SysAreaMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 17:55
 * @Description: com.zlc.hjycommunity.system.service
 * @version: 1.0
 */
public interface SysAreaService {

        /**
         * 获取区域数据的完整树
         * @param
         * @return: java.util.List<com.msb.hjycommunity.system.domain.dto.SysAreaDto>
         */
        List<SysAreaDto> findAreaAsTree();


}
