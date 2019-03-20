package com.nuofankj.springdemo.utility;


import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 操作json的封装方法
 * use:jackson
 */
public class JSONChange {

    /*
     * 001.json转换成对象
     * @param:传入Class，json字符串
     * @return:Object
     */
    public static Object jsonToObj(Class clz, String jsonStr) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(jsonStr, clz);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
     * 002.对象转换成json
     * @param:传入对象
     * @return:json字符串
     */
    public static String objToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}