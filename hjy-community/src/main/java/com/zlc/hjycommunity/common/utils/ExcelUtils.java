package com.zlc.hjycommunity.common.utils;



import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.zlc.hjycommunity.common.core.exception.BaseException;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/20 - 03 - 20 - 22:12
 * @Description: com.zlc.hjycommunity.common.utils
 * @version: 1.0
 */
public class ExcelUtils {

    // 使用LoggerFactory获取Logger实例，用于记录日志
    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);

    /**
     * excel 导出
     *
     * @param list         数据列表
     * @param pojoClass    pojo类型
     * @param fileName     导出时的excel名称
     * @param response     HttpServletResponse对象，用于设置响应信息
     * @param exportParams 导出参数（标题、sheet名称、是否创建表头，表格类型）
     */
    public static void exportExcel(List<?> list, Class<?> pojoClass, String fileName, HttpServletResponse response, ExportParams exportParams){
        // 使用ExcelExportUtil工具类将数据导出到Excel工作簿中
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, list);
        // 调用downLoadExcel方法将生成的Excel文件下载到客户端
        downLoadExcel(fileName, response, workbook);
    }

    /**
     * excel下载
     *
     * @param fileName 下载时的文件名称
     * @param response HttpServletResponse对象，用于设置响应信息
     * @param workbook excel数据
     */
    private static void downLoadExcel(String fileName, HttpServletResponse response, Workbook workbook) {

        // 声明一个ServletOutputStream对象，用于将Excel文件写入响应输出流
        ServletOutputStream outputStream = null;

        try {
            // 设置响应字符编码为UTF-8
            response.setCharacterEncoding("UTF-8");
            // 设置响应头，指定文件名为"小区信息列表.xls"，并指定下载方式为弹框下载
            response.setHeader("content-disposition","attachment;fileName="+ URLEncoder.encode("小区信息列表.xls","UTF-8"));

            // 获取响应输出流
            outputStream = response.getOutputStream();
            // 将Excel工作簿写入输出流
            workbook.write(outputStream);
        } catch (Exception e) {
            // 捕获异常并记录错误日志
            log.error("导出Excel异常{}",e.getMessage());
            // 抛出自定义异常，提示导出Excel失败
            throw new BaseException("500","导出Excel失败，请联系网站管理员！");
        }finally {
            try {
                // 关闭输出流
                outputStream.close();
                // 关闭Excel工作簿
                workbook.close();
            } catch (IOException e) {
                // 捕获并打印关闭流时的异常
                e.printStackTrace();
            }
        }
    }

}