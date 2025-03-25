package com.zlc.springsecurity_example.utils;

/**
 * @Auther: L1CH
 * @Date: 2025/3/23 - 03 - 23 - 17:16
 * @Description: com.zlc.springsecurity_example.utils
 * @version: 1.0
 */

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author spikeCong
 * @date 2023/4/14
 **/
public class WebUtils {

    /**
     * 将字符串渲染到客户端
     *
     * @param response 渲染对象
     * @param string 待渲染的字符串
     * @return null
     */
    public static String renderString(HttpServletResponse response, String string) {
        try
        {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
