package cn.javabase.practice;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ŷ�����շת�����
 * 
 * @author verseboys
 * 
 */
public class Ast {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������������Լ��");
		System.out.println("�������һ������");
		int num2 = input.nextInt();
		System.out.println("������ڶ�������");
		int num3 = input.nextInt();
		Ast g = new Ast();
		int Ast = g.getAst(num2, num3);
		
		JFrame frame=new JFrame();
		JButton button=new JButton("yhbgffgjjj");
		frame.add(button);
		frame.setVisible(true);
		
		System.out.println(num2 + "��" + num3 + "�����Լ��Ϊ��" + Ast);
	}

	/**
	 * շת�����
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
