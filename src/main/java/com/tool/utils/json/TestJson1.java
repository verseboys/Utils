package com.tool.utils.json;

import org.apache.catalina.User;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class TestJson1 {

	private static JSON json;

	public static void main(String[] args) {
		//定义两种不同格式的字符串
        String objectStr="{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}";
        String arrayStr="[{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}]";
    
        //1、使用JSONObject
       // JSONObject jsonObject=JSONObject.fromObject(objectStr);
       // Student stu=(Student)JSONObject.toBean(jsonObject, Student.class);
       
       JSONObject ww=JSON.parseObject(objectStr);
       
       User aa=JSONObject.toJavaObject(ww, User.class);
       
        
        
        //2、使用JSONArray
        //JSONArray jsonArray=JSONArray.fromObject(arrayStr);
        //获得jsonArray的第一个元素
       // Object o=jsonArray.get(0);
        //JSONObject jsonObject2=JSONObject.fromObject(o);
       // Student stu2=(Student)JSONObject.toBean(jsonObject2, Student.class);
        System.out.println("stu:"+aa);
        //System.out.println("stu2:"+stu2);

	}

}
