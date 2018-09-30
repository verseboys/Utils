package com.javabase.adv.inner;
/**
 *
 * @author Administrator  内部类 对外部类变量的修改
 *
 */
public class Test {

	int var=0;
	
	public void test() {
		
		
		new Hello() {
			public void helloFun() {
				Test.this.var=2;
			}
		}.helloFun();
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.test();
		System.out.println(test.var);
	}
	
	
	
	interface Hello{
		void helloFun();
	}
}
