package com.zlc.hjycommunity.community.domain.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 22:17
 * @Description: com.zlc.hjycommunity.community.domain.dto
 * @version: 1.0
 */
// 使用@ExcelTarget注解标记该类为Excel导出的目标类，参数"community"可能指定关联的Excel模板或配置
@ExcelTarget("community")
// Lombok的@Data注解，自动生成getter、setter、toString、equals和hashCode等方法
@Data
// 实现Serializable接口，支持序列化，便于网络传输或持久化存储
public class HjyCommunityExcelDto implements Serializable {

    /**
     * 小区唯一标识ID
     * @Excel注解配置Excel列名为"序号"，将数据库字段映射到Excel表头
     */
    @Excel(name = "序号")
    private Long communityId;

    /**
     * 小区名称
     * @Excel注解配置Excel列名为"小区名称"
     */
    @Excel(name = "小区名称")
    private String communityName;

    /**
     * 小区唯一编码
     * @Excel注解配置Excel列名为"小区编码"
     */
    @Excel(name = "小区编码")
    private String communityCode;

    /**
     * 所属省级行政区划名称
     * @Excel注解配置Excel列名为"省"
     */
    @Excel(name = "省")
    private String communityProvinceName;

    /**
     * 所属地级市名称
     * @Excel注解配置Excel列名为"市"
     */
    @Excel(name = "市")
    private String communityCityName;

    /**
     * 所属区/县级行政区划名称
     * @Excel注解配置Excel列名为"区/县"，表头显示为"区/县"
     */
    @Excel(name = "区/县")
    private String communityTownName;

    /**
     * 数据创建时间
     * @Excel注解配置Excel列名为"创建时间"，并指定日期导出格式为"yyyy年MM月dd日"
     */
    @Excel(name="创建时间", exportFormat = "yyyy年MM月dd日")
    private Date createTime;

    /**
     * 附加备注信息
     * @Excel注解配置Excel列名为"备注"
     */
    @Excel(name = "备注")
    private String remark;

    // 注意：虽然实现了Serializable接口，但这里没有显式定义serialVersionUID，
    // 实际开发中建议通过@Serial注解或手动添加保证序列化版本一致性
    // private static final long serialVersionUID = 1L;
}
