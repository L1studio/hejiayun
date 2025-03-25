package com.zlc.hjycommunity.web.test.controller;

import com.zlc.hjycommunity.common.core.domain.BaseResponse;

import com.zlc.hjycommunity.common.core.exception.BaseException;
import com.zlc.hjycommunity.web.test.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/18 - 03 - 18 - 22:24
 * @Description: com.zlc.hjycommunity.common.core.domain.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/queryUserById")
    public BaseResponse<User> queryUserById(String userId){
        if(userId != null){
            return BaseResponse.success(new User(userId,"spike"));
        }else{
            return BaseResponse.fail("查询用户信息失败！");
        }
    }

    @RequestMapping("/addUser")
    public BaseResponse addUser(@Valid User user,
                                BindingResult bindingResult){
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if(bindingResult.hasErrors()){
            String defaultMessage = fieldErrors.get(0).getDefaultMessage();
            return BaseResponse.fail(defaultMessage);
        }
        return BaseResponse.success("ok");
    }


    @RequestMapping("/queryUser")
    public BaseResponse queryUser(User user){
        //模拟查询失败抛出异常
    throw new BaseException("500","测试异常类！");
    }



}
