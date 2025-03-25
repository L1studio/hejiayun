package com.zlc.hjycommunity.web.test;

import javax.validation.constraints.NotNull;

/**
 * @Auther: L1CH
 * @Date: 2025/3/18 - 03 - 18 - 22:22
 * @Description: com.zlc.hjycommunity.common.core.domain
 * @version: 1.0
 */
public class User {

    @NotNull(message="username不能为空！！")
    private String userId;


    private String username;

    public User() {}
  
    public User(String userId, String username) {
    this.userId = userId;
    this.username = username;
    }

    public String getUserId() {
    return userId;
    }

    public void setUserId(String userId) {
    this.userId = userId;
    }

    public String getUsername() {
    return username;
    }

    public void setUsername(String username) {
    this.username = username;
    }
}
