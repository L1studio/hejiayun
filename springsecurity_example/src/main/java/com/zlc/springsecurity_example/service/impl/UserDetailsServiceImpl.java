package com.zlc.springsecurity_example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zlc.springsecurity_example.entity.LoginUser;
import com.zlc.springsecurity_example.entity.SysUser;
import com.zlc.springsecurity_example.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Auther: L1CH
 * @Date: 2025/3/23 - 03 - 23 - 17:35
 * @Description: com.zlc.springsecurity_example.service
 * @version: 1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private SysUserMapper userMapper;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    //根据用户名查询用户信息
    LambdaQueryWrapper<SysUser> wrapper = new LambdaQueryWrapper<>();
    wrapper.eq(SysUser::getUserName,username);
    SysUser user = userMapper.selectOne(wrapper);

    //如果查询不到数据,抛出异常 给出提示
    if(Objects.isNull(user)){
      throw new RuntimeException("用户名或密码错误");
     }

    //方法的返回值是 UserDetails接口类型,需要返回自定义的实现类
    return new LoginUser(user);
   }
}
