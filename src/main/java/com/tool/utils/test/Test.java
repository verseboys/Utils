/**
 * 
 */
package com.tool.utils.test;

/** 面试题大分析
 * @author verseboys
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t=new Test();
		//		t.test2();
		//		t.test1();
		//		t.test3();
		t.test6();


	}

	public void test1(){

		int sum=0;
		for(int i=1;i<10;i++){    //for i++的执行机制（第一次判断的时候是不运行i++的，只有循环了才允许）
			if(i % 2==2){
				break;
			}
			sum +=i;
		}
		System.out.println(sum);
	}


	public void test2(){

		int sum=0;
		for(int i=20;i>0;i--){
			if(i % 3!=0){
				continue;
			}
			sum +=i;
		}
		System.out.print(sum);
	}

	public void test3(){


		for(int i=0;i<10;i++){
			if(i % 2!=0){
				continue;
			}
			System.out.println(i);
		}

	}
	/**
	 * break、continue只是针对循环while，从执行位置直接跳出到下一个while
	 */
	public void test4(){
		int x=0;
		while(x++ < 10)
		{
			if(x == 3)
			{
				break;
			}
			System.out.println("x="+x);
		}

		int y=0;

		while(y++ < 10)
		{
			if(y == 3)
			{
				continue;
			}
			System.out.println("y="+y);
		}

	}
	/**
	 * 该方法显示了System.out.print内的非“”里，和其他程序码没有区别
	 */
	public void test5(){ 
		int a=0;
		while(a<10){
			if(a>=0){
				System.out.print(a++);
			}

		}
	}
	public void test6(){ 
		for(int i=0;i<5;i++){
			while(i%2==2){// 此处相当于拦截器，只能允许满足条件的通过i%2==2，（而不是判断），此时无限循环
				continue;
			}
			int a=(11+3*9)/7%3;
			
			
//			Arrays.sort(a);;
		
			
			
			System.out.print(a);
		}
		
	}

}
