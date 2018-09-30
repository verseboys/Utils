package com.javabase.adv.oo;
/**
 * 
        * @desc: javabasecharter1  
        * @author: verseboys  
        * @createTime: 2018年3月1日 下午1:51:50  
        * @history:  两个类之间传值
        * @version: v1.0
 */
public class Test2 {

	

	test1 p = new test1();
	
	public static void main(String[] args){
		Test2 t = new Test2();
		System.out.println(t.p.io);
		System.out.println(t.p.j);
	}

	class test1{
		//空值
		private int io;
		
		int j=10;
	}
}
