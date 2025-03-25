package com.zlc.hjycommunity.web.controller.system;

import com.zlc.hjycommunity.common.core.controller.BaseController;
import com.zlc.hjycommunity.common.core.domain.BaseResponse;
import com.zlc.hjycommunity.system.domain.SysDept;
import com.zlc.hjycommunity.system.service.SysDeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 17:15
 * @Description: com.zlc.hjycommunity.web.controller.system
 * @version: 1.0
 */
@RestController
@RequestMapping(value="/system/dept")
public class SysDeptController extends BaseController {

    @Resource
    private SysDeptService sysDeptService;

    @GetMapping("/list")
    public BaseResponse llist(SysDept sysDept) {
        List<SysDept> sysDepts = sysDeptService.selectDeptList(sysDept);
        return BaseResponse.success(sysDepts);
    }


}
