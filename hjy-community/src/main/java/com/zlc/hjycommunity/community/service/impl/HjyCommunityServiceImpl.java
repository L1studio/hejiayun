package com.zlc.hjycommunity.community.service.impl;

import com.zlc.hjycommunity.common.utils.OrikaUtils;
import com.zlc.hjycommunity.community.domain.HjyCommunity;
import com.zlc.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.zlc.hjycommunity.community.domain.vo.HjyCommunityVO;
import com.zlc.hjycommunity.community.mapper.HjyCommunityMapper;
import com.zlc.hjycommunity.community.service.HjyCommunityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
* @Auther: L1CH
* @Date: 2025/3/19 - 03 - 19 - 11:13
* @Description: com.zlc.hjycommunity.community.service.impl
* @version: 1.0
*/

@Service
public class HjyCommunityServiceImpl implements HjyCommunityService {

    @Resource
    private HjyCommunityMapper hjycommunityMapper;

    private static final String CODE_PREFIX = "COMMUNITY_";

    @Override
    public List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity) {
        return hjycommunityMapper.queryList(hjyCommunity);
    }

    @Override
    public int insertHjyCommunity(HjyCommunity hjyCommunity) {
        //设置小区编码
        hjyCommunity.setCommunityCode(CODE_PREFIX + System.currentTimeMillis());
        return hjycommunityMapper.insert(hjyCommunity);
    }

    @Override
    public HjyCommunity selectHjyCommunityById(Long communityId) {
        return hjycommunityMapper.selectById(communityId);
    }

    @Override
    public int updateHjyCommunity(HjyCommunity hjyCommunity) {
        return hjycommunityMapper.updateById(hjyCommunity);
    }

    @Override
    public int deleteHjyCommunityByIds(Long[] communityIds) {
        int count = hjycommunityMapper.deleteBatchIds(Arrays.asList(communityIds));
        return count;
    }

    @Override
    public List<HjyCommunityVO> queryPullDown(HjyCommunity community) {
          List<HjyCommunityDto> dtoList = hjycommunityMapper.queryList(community);
          List<HjyCommunityVO> voList = dtoList.stream().map(dto -> {
            //对象拷贝
          HjyCommunityVO communityVo = OrikaUtils.convert(dto, HjyCommunityVO.class);
            return communityVo;
           }).collect(Collectors.toList());
          return voList;
    }


}