package com.zlc.hjycommunity.common.core.exception;

import com.zlc.hjycommunity.common.core.domain.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 9:52
 * @Description: com.zlc.hjycommunity.common.core.exception
 * @version: 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
       * 基础异常
       * @param e
       * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
       */
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse baseExceptionHandler(BaseException e) {
         return BaseResponse.fail(e.getDefaultMessage());
    }

}
