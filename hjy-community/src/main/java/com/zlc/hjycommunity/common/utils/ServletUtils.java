package com.zlc.hjycommunity.common.utils;

// 导入Spring Web请求上下文相关类
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

// 导入Servlet相关类
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 客户端工具类：封装与HTTP请求、响应相关的常用操作
 * 目的：简化Servlet API调用，提供快速访问请求、响应、参数等的方法
 */
public class ServletUtils {

    /**
     * 获取当前线程绑定的ServletRequestAttributes对象
     * 说明：通过Spring的RequestContextHolder获取当前请求上下文
     */
    public static ServletRequestAttributes getRequestAttributes() {
        // 从当前线程获取请求属性（线程安全）
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        // 转换为Servlet专用的请求属性对象
        return (ServletRequestAttributes) attributes;
    }

    /**
     * 获取当前HTTP请求对象（HttpServletRequest）
     * 用途：读取请求参数、请求头、URL等信息
     */
    public static HttpServletRequest getRequest() {
        // 通过请求属性对象获取HttpServletRequest
        return getRequestAttributes().getRequest();
    }

    /**
     * 获取当前会话对象（HttpSession）
     * 注意：如果会话不存在，此方法会自动创建新会话
     */
    public static HttpSession getSession() {
        // 通过请求对象获取Session
        return getRequest().getSession();
    }

    /**
     * 获取当前HTTP响应对象（HttpServletResponse）
     * 用途：设置响应头、状态码、写入响应内容等
     */
    public static HttpServletResponse getResponse() {
        // 通过请求属性对象获取HttpServletResponse
        return getRequestAttributes().getResponse();
    }

    /**
     * 获取请求中的String类型参数
     * @param name 参数名称
     * @return 参数值（若不存在返回null）
     */
    public static String getParameter(String name) {
        // 从请求对象中获取指定参数值
        return getRequest().getParameter(name);
    }

    /**
     * 获取请求中的Integer类型参数
     * @param name 参数名称
     * @return 参数值转换为Integer（若参数不存在或格式错误会抛出NumberFormatException）
     */
    public static Integer getParameterToInt(String name) {

        // 将字符串参数解析为整数
        return Integer.parseInt(getRequest().getParameter(name));
    }

    /**
     * 将字符串内容渲染到客户端（常用于返回JSON数据）
     * @param response 响应对象（实际可通过getResponse()获取）
     * @param string 要输出的字符串内容
     * @return 固定返回null（设计意图可能是用于Controller直接返回）
     */
    public static String renderString(HttpServletResponse response, String string) {
        try {
            // 设置HTTP状态码为200（成功）
            response.setStatus(200);
            // 设置响应内容类型为JSON
            response.setContentType("application/json");
            // 设置字符编码为UTF-8
            response.setCharacterEncoding("utf-8");
            // 将字符串写入响应体
            response.getWriter().print(string);
        } catch (IOException e) {
            // 打印异常堆栈（实际生产环境建议记录日志）
            e.printStackTrace();
        }
        return null; // 方便Controller层直接返回此结果
    }
}