package com.javabase.adv.oo;
/**
 * 
        * @desc: javabasecharter1  
        * @author: verseboys  
        * @createTime: 2018��3��1�� ����1:51:50  
        * @history:  ������֮�䴫ֵ
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
		//��ֵ
		private int io;
		
		int j=10;
	}
}
