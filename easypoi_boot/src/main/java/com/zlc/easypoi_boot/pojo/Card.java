package com.zlc.easypoi_boot.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 19:13
 * @Description: com.zlc.easypoi_boot.pojo
 * @version: 1.0
 */
@ExcelTarget("card")
@Data
public class Card {
    @Excel(name="身份证号" ,orderNum = "5")
    private String id;

    @Excel(name="地址" ,orderNum = "6")
    private String address;
}
