package com.zlc.hjycommunity.community.service;

import com.zlc.hjycommunity.community.domain.HjyCommunity;
import com.zlc.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.zlc.hjycommunity.community.domain.vo.HjyCommunityVO;

import java.util.List;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 11:11
 * @Description: com.zlc.hjycommunity.community.service.impl
 * @version: 1.0
 */
public interface HjyCommunityService {

    List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity);


    int insertHjyCommunity(HjyCommunity hjyCommunity);

    HjyCommunity selectHjyCommunityById(Long communityId);

    int updateHjyCommunity(HjyCommunity hjyCommunity);

    int deleteHjyCommunityByIds(Long[] communityIds);


/**
    * 获取小区下拉列表
    * @param community
    * @return: com.msb.hjycommunity.community.domain.vo.HjyCommunityVo
    */
        List<HjyCommunityVO> queryPullDown(HjyCommunity community);

}
