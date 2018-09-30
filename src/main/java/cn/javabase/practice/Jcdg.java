package cn.javabase.practice;
import java.util.Scanner;
public class Jcdg {
	public static int Factorial(int n) {
		if (n < 0) {
			System.out.println("无效输入，请重新输入！");
			return 0;
		} else if (n == 1 || n == 0) {
			return 1;
		} else
			return n * Factorial(n - 1);	
	}
	public static void main(String[] args) {
		System.out.println("整数阶乘的计算");
		System.out.println("请输入一个整数:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n+"*"+Factorial(n - 1)+"等于："+Factorial(n));
		System.out.println(n +"的阶乘是："+ Factorial(n));
	}
}
