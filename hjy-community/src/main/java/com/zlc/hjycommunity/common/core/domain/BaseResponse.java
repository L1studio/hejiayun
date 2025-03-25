package com.zlc.hjycommunity.common.core.domain;

import java.io.Serializable;

/**
 * @Auther: L1CH
 * @Date: 2025/3/18 - 03 - 18 - 21:46
 * @Description: com.zlc.hjycommunity.common.core.domain
 * @version: 1.0
 */

public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = -8133649325507226674L;
    /**
     * 响应状态码
     */
    private String code;
    /**
     * 响应结果描述
     */
    private String message;
    /**
     * 返回的数据
     */
    private T data;
    /**
     * 成功返回
     * @param data
     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse<T>
     */
    public static <T> BaseResponse<T> success(T data){

        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMessage(ResultCode.SUCCESS.getMessage());
        response.setData(data);

        return response;
    }
    /**
     * 失败返回
     * @param message
     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse<T>
     */
    public static <T> BaseResponse<T> fail(String message){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(ResultCode.ERROR.getCode());
        response.setMessage(message);
        return response;
    }
    /**
     * 失败返回
     * @param message
     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse<T>
     */
    public static <T> BaseResponse<T> fail(String code, String message){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
