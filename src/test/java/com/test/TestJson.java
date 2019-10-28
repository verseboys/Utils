package com.test;

import org.junit.After;
import org.junit.Test;

import com.tool.utils.json.Student;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestJson {
	
	
	@Test
	public  void jsonStrToJava(){
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


        @After
        public void tearDown() throws Exception {

        }



    public static void main(String args[]) {

	    System.out.println("Hello World!");
    }


}
