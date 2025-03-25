package com.zlc.hjycommunity.common.core.domain;

/**
 * @Auther: L1CH
 * @Date: 2025/3/18 - 03 - 18 - 21:43
 * @Description: com.zlc.hjycommunity.common.core.domain
 * @version: 1.0
 */

public enum ResultCode {
    /**操作成功**/
  SUCCESS("200","操作成功"),
    /**操作失败**/
  ERROR("500","操作失败"),;

  /** 自定义状态码**/
  private String code;
  /**自定义描述**/
  private String message;

  ResultCode(String code, String message) {
    this.code = code;
    this.message = message;
   }

  public String getCode() {
    return code;
   }

  public String getMessage() {
    return message;
   }

}
