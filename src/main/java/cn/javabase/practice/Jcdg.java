package cn.javabase.practice;
import java.util.Scanner;
public class Jcdg {
	public static int Factorial(int n) {
		if (n < 0) {
			System.out.println("��Ч���룬���������룡");
			return 0;
		} else if (n == 1 || n == 0) {
			return 1;
		} else
			return n * Factorial(n - 1);	
	}
	public static void main(String[] args) {
		System.out.println("�����׳˵ļ���");
		System.out.println("������һ������:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n+"*"+Factorial(n - 1)+"���ڣ�"+Factorial(n));
		System.out.println(n +"�Ľ׳��ǣ�"+ Factorial(n));
	}
}
