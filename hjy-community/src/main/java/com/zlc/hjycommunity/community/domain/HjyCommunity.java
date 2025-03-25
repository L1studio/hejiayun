package com.zlc.hjycommunity.community.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zlc.hjycommunity.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 10:40
 * @Description: com.zlc.hjycommunity.community.domain
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HjyCommunity extends BaseEntity {

    private static final long serialVersionUID = 8736084879612591841L;


    @TableId
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;

    /**
     * 小区名称
     */
    private String communityName;

    /**
     * 小区编码
     */
    private String communityCode;

    /**
     * 省区划码
     */
    private String communityProvinceCode;
//    private String communityProvinceName;
    // 测试出现问题需要注释掉，待解决的问题，在获取小区信息时出现问题

    /**
     * 市区划码
     */
    private String communityCityCode;
//    private String communityCityName;

    /**
     * 区县区划码
     */
    private String communityTownCode;
//    private String communityTownName;



    /**
     * 详细地址
     */
    private String communityDetailedAddress;

    /**
     * 经度
     */
    private String communityLongitude;

    /**
     * 纬度
     */
    private String communityLatitude;

    /**
     * 物业id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long deptId;

    /**
     * 排序
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communitySort;

}
