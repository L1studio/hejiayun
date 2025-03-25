package com.zlc.easypoi_boot.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 19:17
 * @Description: com.zlc.easypoi_boot.pojo
 * @version: 1.0
 */
@ExcelTarget("order")
@Data
public class Order {
    @Excel(name="订单编号")
    private String id;

    @Excel(name="订单名称")
    private String name;

}
