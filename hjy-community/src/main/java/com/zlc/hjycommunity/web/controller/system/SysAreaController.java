package com.zlc.hjycommunity.web.controller.system;

import com.zlc.hjycommunity.common.core.controller.BaseController;
import com.zlc.hjycommunity.common.core.domain.BaseResponse;
import com.zlc.hjycommunity.system.service.SysAreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 18:00
 * @Description: com.zlc.hjycommunity.web.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/system/area")
public class SysAreaController extends BaseController {
    @Resource
    private SysAreaService sysAreaService;

    @RequestMapping("/tree")
    public BaseResponse getAreaTree(){
        return BaseResponse.success(sysAreaService.findAreaAsTree());
    }

}
