package com.javabase.adv.inner;

public class Test1 {
	public String demo="qw4rqwer";

	public void changValue()
	{
		this.demo=" hello word";
	}
	class DemoOuterclass
	{
		public  DemoOuterclass()
		{
			changValue();
		}
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		System.err.println("demo1"+t.demo);
		Test1.DemoOuterclass demo=t.new DemoOuterclass();
		System.err.println("demo2"+t.demo);
	}
	public String getDemo() {
		return demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}
}
