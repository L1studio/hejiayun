package com.zlc.hjycommunity.system.domain.dto;

import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 17:24
 * @Description: com.zlc.hjycommunity.system.domain
 * @version: 1.0
 */
public class SysAreaDto {

    //区划码
    private Integer code;

    //区划名称
    private String name;

    //子区划
    private List<SysAreaDto> children;

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

    public List<SysAreaDto> getChildren() {
        return children;
    }

    public void setChildren(List<SysAreaDto> children) {
        this.children = children;
    }
}
