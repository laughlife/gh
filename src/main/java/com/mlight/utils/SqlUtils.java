package com.mlight.utils;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.*;


public class SqlUtils {

    /**
     * 替换内容
     *
     * @author 李伟
     * @time 2014-7-2 上午12:44:57
     */
    public static List lowerMapKey(List list) {
        List result = new ArrayList();
        for (Object obj : list) {
            Map<String, Object> map = (Map<String, Object>) obj;
            Map<String, Object> hashMap = new HashMap<String, Object>();
            for (String key : map.keySet()) {
                hashMap.put(key.toLowerCase(), map.get(key));
            }
            result.add(hashMap);
        }
        return result;
    }

}
