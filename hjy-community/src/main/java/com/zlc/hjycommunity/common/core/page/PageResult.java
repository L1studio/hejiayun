package com.zlc.hjycommunity.common.core.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 分页查询同一封装
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 14:54
 * @Description: com.zlc.hjycommunity.common.core.page
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 总记录数 */
          private long total;
  /** 列表数据 */
          private List<?> rows;
  /** 消息状态码 */
          private int code;
  /** 消息内容 */
          private String msg;
          /**
             * 分页
             * @param total 列表数据
             * @param rows  总记录数
             * @return: null
             */
    public PageResult(long total, List<?> rows) {
    this.total = total;
    this.rows = rows;
   }

}
