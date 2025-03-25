package com.zlc.hjycommunity.community.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zlc.hjycommunity.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auther: L1CH
 * @Date: 2025/3/19 - 03 - 19 - 10:51
 * @Description: com.zlc.hjycommunity.community.domain.dto
 * @version: 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HjyCommunityVO implements Serializable {
        /** 小区id
         * shape = Shape.STRING 表示强制将 communityId 字段的值以 字符串形式 处理，而非默认的数值类型。
         *
         * 序列化时：将 Long 类型的 communityId 转换为 JSON 字符串（例如 "123456"）。
         *
         * 反序列化时：将 JSON 字符串（如 "123456"）转换回 Long 类型。*/
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        private Long communityId;

        /** 小区名称  */
        private String communityName;

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
}
