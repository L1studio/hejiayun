package com.zlc.hjycommunity.common.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlc.hjycommunity.common.constant.HttpStatus;
import com.zlc.hjycommunity.common.core.domain.BaseResponse;
import com.zlc.hjycommunity.common.core.page.PageDomain;
import com.zlc.hjycommunity.common.core.page.PageResult;
import com.zlc.hjycommunity.common.utils.ServletUtils;

import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 15:08
 * @Description: com.zlc.hjycommunity.common.core.controller
 * @version: 1.0
 */

public class BaseController {
    
  /**
    * 当前记录起始索引
    */
    public static final String PAGE_NUM = "pageNum";
           /**
              * 每页显示记录数
              */
    public static final String PAGE_SIZE = "pageSize";
  /**
    * 封装分页数据
    */
    public static PageDomain getPageDomain() {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        return pageDomain;
   }
  /**
    * 调用PageHelper的startPage，设置分页参数
    */
    protected void startPage(){
        PageDomain pageDomain = getPageDomain();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (pageNum != null && pageSize != null) {
          PageHelper.startPage(pageNum, pageSize);
         }
   }
  /**
    * 响应分页数据
    * @param list
    * @return:
    */
  protected PageResult getData(List<?> list){
    PageResult pageResult = new PageResult();
    pageResult.setCode(HttpStatus.SUCCESS);
    pageResult.setMsg("查询成功");
    pageResult.setRows(list);
    pageResult.setTotal(new PageInfo(list).getTotal());
    return pageResult;
   }
    /**
     * 响应返回结果
     * @param rows 受影响行数
     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
     */
    protected BaseResponse toAjax(int rows){
        return rows > 0 ? BaseResponse.success(rows) : BaseResponse.fail("操作失败");
    }
}
