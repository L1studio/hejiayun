package com.zlc.springsecurity_example.mapper;

import com.zlc.springsecurity_example.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: L1CH
 * @Date: 2025/3/23 - 03 - 23 - 17:26
 * @Description: com.zlc.springsecurity_example.mapper
 * @version: 1.0
 */
@SpringBootTest
class SysUserMapperTest {
    @Autowired
  private SysUserMapper sysUserMapper;

  @Test
  public void testUserMapper(){
    List<SysUser> users = sysUserMapper.selectList(null);
    System.out.println(users);
   }
}