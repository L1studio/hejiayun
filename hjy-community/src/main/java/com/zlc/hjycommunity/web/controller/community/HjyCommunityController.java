package com.zlc.hjycommunity.web.controller.community;



import com.zlc.hjycommunity.common.core.controller.BaseController;
import com.zlc.hjycommunity.common.core.domain.BaseResponse;
import com.zlc.hjycommunity.common.core.page.PageResult;
import com.zlc.hjycommunity.community.domain.HjyCommunity;
import com.zlc.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.zlc.hjycommunity.community.domain.vo.HjyCommunityVO;
import com.zlc.hjycommunity.community.service.HjyCommunityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 小区 Controller
 * @author spikeCong
 * @date 2023/2/28
 **/
@RestController
@RequestMapping("/community")
@Slf4j
public class HjyCommunityController extends BaseController {

  @Resource
  private HjyCommunityService hjyCommunityService;

  @GetMapping("/list")
  public PageResult list(HjyCommunity hjyCommunity){
    startPage();
    List<HjyCommunityDto> list = hjyCommunityService.queryList(hjyCommunity);
    //响应数据
    return getData(list);
   }

  /**
   * 新增小区
   * @param hjyCommunity
   * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
   */
  @PostMapping("/add")
  public BaseResponse add(@RequestBody HjyCommunity hjyCommunity){

    return toAjax( hjyCommunityService.insertHjyCommunity(hjyCommunity));
  }


  /**
   * 根据id查询小区信息
   * @param communityId
   * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
   */
  @GetMapping(value = "/{communityId}")
  public BaseResponse getInfo(@PathVariable("communityId") Long communityId){

    return BaseResponse.success(hjyCommunityService.selectHjyCommunityById(communityId));
  }


  @PutMapping
  public BaseResponse update(@RequestBody HjyCommunity hjyCommunity){
    return toAjax(hjyCommunityService.updateHjyCommunity(hjyCommunity));
  }

  @DeleteMapping(value = "/{communityIds}")
  public BaseResponse delete(@PathVariable("communityIds") Long[] communityIds){
    int count = hjyCommunityService.deleteHjyCommunityByIds(communityIds);
    return toAjax(count);
  }

  @GetMapping("/queryPullDown")
  public BaseResponse queryPullDown(HjyCommunity hjyCommunity){

    //打印入参日志
    log.info("log() called with parameters => [hjyCommunity = {}]",hjyCommunity);
    List<HjyCommunityVO> voList = null;
    try {
      voList = hjyCommunityService.queryPullDown(hjyCommunity);
     } catch (Exception e) {
      log.warn("获取小区下拉列表失败! !",e);
     }
    //打印返回结果
    log.info("log() returned: {}",voList);
    return BaseResponse.success(voList);
  }

}