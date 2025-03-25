package com.zlc.easypoi_boot.pojo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 18:47
 * @Description: com.zlc.easypoi_boot.pojo
 * @version: 1.0
 */
@ExcelTarget("User")
@Data
public class User implements Serializable {
    @Excel(name="编号",orderNum = "1")
    private Integer id;

    @Excel(name="姓名",orderNum = "2")
    private String name;

    @Excel(name="生日",orderNum = "3",width = 15,exportFormat = "yyyy年MM月dd日")
    private Date bir;

    @Excel(name="年龄",orderNum = "4",suffix="$")
    private Integer age;

    @ExcelEntity(name="身份信息")
    private Card card;

    @ExcelCollection(name="订单",orderNum = "8")
    private List<Order> Orderlist;




}
