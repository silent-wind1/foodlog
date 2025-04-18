package com.yefeng.common;

import cn.hutool.core.codec.Base64Encoder;
import cn.hutool.json.JSONUtil;


/**
 * @Author: 叶枫
 * @Date: 2024/05/16/14:01
 * @Description: 生成RedisKey
 */
public class RedisKeyCommon {
    /**
     * 获取分页Key
     *
     * @param data 查询请求
     * @return key
     */
    public static <T> String getPageCacheKey(T data) {
        String JsonStr = JSONUtil.toJsonStr(data);
        String base64 = Base64Encoder.encode(JsonStr);
        return "generator:page:" + base64;
    }
}
