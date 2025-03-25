package com.zlc.hjycommunity.web.controller.common;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.zlc.hjycommunity.common.core.controller.BaseController;
import com.zlc.hjycommunity.common.core.domain.BaseResponse;
import com.zlc.hjycommunity.common.utils.ExcelUtils;
import com.zlc.hjycommunity.community.domain.HjyCommunity;
import com.zlc.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.zlc.hjycommunity.community.domain.dto.HjyCommunityExcelDto;
import com.zlc.hjycommunity.community.service.HjyCommunityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 22:19
 * @Description: com.zlc.hjycommunity.web.controller.common
 * @version: 1.0
 */
// 声明这是一个Spring MVC控制器类
@Controller
// 定义控制器的基础请求路径为/exportExcel
@RequestMapping("/exportExcel")
// 继承基础控制器类，可能包含通用方法（如分页处理）
public class ExportExcelController extends BaseController {

    // 依赖注入小区服务层接口
    @Resource
    private HjyCommunityService hjyCommunityService;

    /**
     * 导出小区数据到Excel
     * @param hjyCommunity 包含查询条件的实体对象
     * @param response HTTP响应对象，用于输出Excel文件流
     * @return 操作结果响应（实际导出操作通过response完成，此处返回状态提示）
     */
    @GetMapping("/exportCommunityExcel")  // 映射GET请求到/exportExcel/exportCommunityExcel路径
    public BaseResponse exportExcel(HjyCommunity hjyCommunity, HttpServletResponse response) {
        // 调用父类的分页初始化方法（可能设置分页参数，但导出场景一般不需要分页）
        startPage();

        // 根据条件查询小区数据列表（返回DTO格式数据）
        List<HjyCommunityDto> list = hjyCommunityService.queryList(hjyCommunity);

        // 将DTO列表转换为Excel专用DTO列表（适配Excel导出格式）
        List<HjyCommunityExcelDto> excelDtoList = list.stream().map(
                hjyCommunityDto -> {
                    // 创建Excel专用DTO对象
                    HjyCommunityExcelDto excelDto = new HjyCommunityExcelDto();
                    // 逐个字段赋值（实体转换）
                    excelDto.setCommunityId(hjyCommunityDto.getCommunityId());
                    excelDto.setCommunityName(hjyCommunityDto.getCommunityName());
                    excelDto.setCommunityCode(hjyCommunityDto.getCommunityCode());
                    excelDto.setCommunityProvinceName(hjyCommunityDto.getCommunityProvenceName());
                    excelDto.setCommunityCityName(hjyCommunityDto.getCommunityCityName());
                    excelDto.setCommunityTownName(hjyCommunityDto.getCommunityTownName());
                    excelDto.setCreateTime(hjyCommunityDto.getCreateTime());
                    excelDto.setRemark(hjyCommunityDto.getRemark());
                    return excelDto;
                }
        ).collect(Collectors.toList());  // 收集流结果为List集合

        // 调用Excel工具类执行导出操作
        ExcelUtils.exportExcel(
                excelDtoList,              // 导出的数据集合
                HjyCommunityExcelDto.class, // 定义Excel结构的DTO类
                "小区信息",                  // 文件名称标识
                response,                  // HTTP响应对象
                new ExportParams(           // 导出参数配置
                        "小区信息列表",       // Excel文档标题（可能显示在顶部）
                        "小区信息"           // Sheet名称
                ));

        // 返回操作成功的响应（注意：实际文件已通过response输出，此为附加状态信息）
        return BaseResponse.success("导出成功");
    }
}