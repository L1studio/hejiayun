package com.zlc.hjycommunity.common.core.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分页参数封装
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 14:50
 * @Description: com.zlc.hjycommunity.common.core.page
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDomain {

    /**
     * 记录当前起始索引
     */
    private Integer pageNum;
    /**
     * 每页显示记录数
     */
    private Integer pageSize;


}
