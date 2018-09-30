package cn.javabase.practice;

import java.util.*;
public class Apyoux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SR = new Scanner(System.in);
		Scanner Sc = new Scanner(System.in);
		String Answer = null;
		do{
			System.out.println("----请输入需排序数字的个数----");
			int n = Sc.nextInt();
			int  data [ ] = new int[n];
			int temp;
			System.out.println("----请任意输入"+n+"个整数----");
			for( int i =0; i<data.length ;i++){
				data [ i ] = SR.nextInt();
			}
			System.out.println("你输入的5个数是：");
			for(int i =0;i<data.length;i++){
				System.out.print(data[ i ]+ " ");
			}
			System.out.println();
			for (int i=1;i<data.length;i++){
				for(int j=0;j<data.length-i;j++){
					if(data[j]>data[j+1]){
						temp=data[j];
						data[j]=data[j+1];
						data[j+1]=temp;
					}
				}
			}
			System.out.println("排序后的数组为：");
			for( int i = 0; i<data.length ;i++){
				System.out.print(data[ i ]+ " ");
			}
			System.out.println();
			System.out.println("是否返回排序？!(y/n)");
			Scanner in=new Scanner(System.in);
			Answer =in.next();
		}while(!"n".equals(Answer));
	}
}





