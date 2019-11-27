package com.fsl.manager.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一封装后台返回的格式
 */
public class ManagerResult {
    private static final Map<String,Object> map = new HashMap<>();

    private  Object data;//返回给前台的数据
    private  Integer status;//返回给前台的状态

    private ManagerResult(){

    }
    private   ManagerResult(Object data,Integer status){

    }
    public  static  Map<String,Object> success(Object obj){
       map.put("data",obj);
       map.put("status",200);
        return map;
    }

    public static Map<String,Object> fail(Object obj,Integer status){
        map.put("data",obj);
        map.put("status",status);
       return map;
    }
}
