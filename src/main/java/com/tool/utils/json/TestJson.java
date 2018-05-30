package com.tool.utils.json;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestJson {
	
	
	@Test
	public static void jsonStrToJava(){
        //定义两种不同格式的字符串
        String objectStr="{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}";
        String arrayStr="[{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}]";
    
        //1、使用JSONObject
        JSONObject jsonObject=JSONObject.fromObject(objectStr);
        Student stu=(Student)JSONObject.toBean(jsonObject, Student.class);
        
        //2、使用JSONArray
        JSONArray jsonArray=JSONArray.fromObject(arrayStr);
        //获得jsonArray的第一个元素
        Object o=jsonArray.get(0);
        JSONObject jsonObject2=JSONObject.fromObject(o);
        Student stu2=(Student)JSONObject.toBean(jsonObject2, Student.class);
        System.out.println("stu:"+stu);
        System.out.println("stu2:"+stu2);
        
    }

}
