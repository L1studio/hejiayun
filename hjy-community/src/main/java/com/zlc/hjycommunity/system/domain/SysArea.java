package com.zlc.hjycommunity.system.domain;

import java.io.Serializable;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 17:23
 * @Description: com.zlc.hjycommunity.system.domain
 * @version: 1.0
 */
public class SysArea implements Serializable {

    /**
     * 区划码
     */
    private Integer code;
    /**
     * 区划名称
     */
    private String name;
    /**
     * 上级区划码
     */
    private Integer parentCode;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }
}
