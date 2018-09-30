/**
 * 
 */
package cn.javabase.charter3;

import java.util.Scanner;

/**判断是否是素数
 * 素数是大于等于1的自然数中可以被自身和一整除的自然数
 * @author verseboys
 *
 */
public class Sushu {
	Scanner input = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Sushu sushu = new Sushu();
		 sushu.name();
		
	}
	
	public void name() {
		
		System.out.println("请输入你要判断的数字！");
		int shu=input.nextInt();
		int i=2,flag=0;

		if (shu>1) {    //判断时候，不能写shu>=1  应该写
			while(flag==0&&i<shu||shu==2){
				if (shu%i==0) {
					flag=1;
				} else {
					i++;
				}
			}
			if (flag==0) {
				System.out.println(shu+"是素数！");
			}else {
				System.out.println(shu+"不是是素数！");
			}

		} else {
			System.out.println("素数是大于等于一的自然数中可以被自身和一整除的数!");
			
		}
		returnable();
	}
	public void returnable() {
		System.out.println("是否重新输入？（y/n）");
		String answer=input.next();
		if (answer.equals("y")) {
			name();
		}else {
			System.out.println("已退出系统！");
		}
		
	}
	
	
}
