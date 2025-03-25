package com.zlc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: L1CH
 * @Date: 2025/3/21 - 03 - 21 - 17:15
 * @Description: com.zlc.controller
 * @version: 1.0
 */
@RestController
public class HelloController {
    
  @RequestMapping("/hello")
  public String hello(){
      return "hello";
   }


}
