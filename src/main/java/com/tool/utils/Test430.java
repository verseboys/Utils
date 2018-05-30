package com.tool.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Test430 { 
	  public List<String> testRandomString(int order){
		  //       创建List<String>
		           List<String> ls = new ArrayList<String>();
		          String ku = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		  /*       定义�?个StringBuilder用以保存生成的字符串，这里不选用String和StringBuffer（String长度
		         不可变，StringBuffer没有StringBuilder快）*/
		           StringBuilder newStr = new StringBuilder();
		 //       创建�?个Random用以生成伪随机数，也可采用Math.random()来实�?
		           Random r = new Random();
		          for(int j = 0;j<order;j++){
		            do{
		  //              将newStr置空
		                newStr.delete(0,newStr.length());
		  //              得到字符串长度的随机�?
		                 int r1 = r.nextInt(10)+1;
		                 for(int i = 0;i<r1;i++){
		  //                  得到随机字符
		                     int r2 = r.nextInt(ku.length());
		                    newStr.append(ku.charAt(r2));
		                  }
		           }while(ls.contains(newStr.toString()));
		              ls.add(newStr.toString());
		          }
		          return ls;
		      }
		      public static void main(String[] args){
		         Test430 t = new Test430();
		        List<String> tattedCode = t.testRandomString(3);
		         System.out.println("===排序�?===");
		           for(String s:tattedCode){
		              System.out.println(s);
		         }
		        Collections.sort(tattedCode);
		         System.out.println("===排序�?===");
		         for (String sec:tattedCode){
		              System.out.println(sec);
		          }
		      }
} 