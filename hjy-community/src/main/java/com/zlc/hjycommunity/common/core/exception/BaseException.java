package com.zlc.hjycommunity.common.core.exception;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 9:47
 * @Description: com.zlc.hjycommunity.common.core.exception
 * @version: 1.0
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = -4415667421315866492L;

    private String code;

    private String defaultMessage;

    public BaseException(){}

   public BaseException(String code, String defaultMessage) {
    super(defaultMessage);
    this.code = code;
    this.defaultMessage = defaultMessage;
   }

  public String getCode() {
    return code;
   }

  public String getDefaultMessage() {
    return defaultMessage;
   }

}
