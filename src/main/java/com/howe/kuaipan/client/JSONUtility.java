package com.howe.kuaipan.client;

import com.alibaba.fastjson.JSON;

import java.util.Map;


public class JSONUtility {
    private JSONUtility() {
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> parse(String str) {
        if (str == null)
            return null;

        Map<String, Object> result = null;
        result = (Map<String, Object>) JSON.parse(str);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parse("{\"name\": \"\\u65b0\\u5efa\\u6587\\u4ef6\"}"));
        System.out.println(parse("{'a': '23'}"));
    }
}
