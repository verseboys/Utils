package cn.javabase.practice;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 欧几里得辗转相除法
 * 
 * @author verseboys
 * 
 */
public class Ast {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("查找两个整数最大公约数");
		System.out.println("请输入第一个数：");
		int num2 = input.nextInt();
		System.out.println("请输入第二个数：");
		int num3 = input.nextInt();
		Ast g = new Ast();
		int Ast = g.getAst(num2, num3);
		
		JFrame frame=new JFrame();
		JButton button=new JButton("yhbgffgjjj");
		frame.add(button);
		frame.setVisible(true);
		
		System.out.println(num2 + "与" + num3 + "的最大公约数为：" + Ast);
	}

	/**
	 * 辗转相除类
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int getAst(int i, int j) {
		int k;
		while ((k = i % j) != 0) {
			i = j;
			j = k;
		}
		return j;
	}
}
