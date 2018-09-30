package cn.javabase.practice;
import java.util.Random;
import java.util.Scanner;
public class cqyx {
	public static void main(String[ ] args) {
		// TODO Auto-generated method stub
		System.out.println("-----我们一起游戏吧-----");
		System.out.println("   1.猜拳游戏");
		System.out.println("   2.猜数游戏");
		System.out.println("   3.疯狂7道题");
		System.out.println("   4.冒泡排序游戏");
		System.out.println("   5.九九二乘法");
		System.out.println(" **输入游戏选择哟**");
		System.out.println("-------------------");
		Scanner input=new Scanner(System.in);  
		int a=input.nextInt();
		switch(a){
		case 1:
			Scanner ina=new Scanner(System.in);                											//定义输入函数in,Scanner包功能,输入数值用的
			String Answer = null;
			do{
				System.out.println("--------------猜拳游戏---------------");
				System.out.println("请输入一个数值:1、石头 2、剪刀 3、布");             //提示输入数值
				System.out.println(" ");                                                                               //空行
				int x=ina.nextInt();                                                                                         //让用户输入X的数值
				Random on=new Random();																			//定义电脑的随机数值的函数on
				int y=on.nextInt(3)+1;																			//定义y随机函数数值范围(1--3)

				if(x>=4||x<=0){   																					//判断用户是否输入非1--3范围
					System.out.println("亲,请正确输入:1、石头 2、剪刀 3、布。你输入了:"+x); 
				}
				else{                                  																 /*下面是判断用户输入x的数值 嵌套if*/

					if(x==y){  
						if(x==1){ 																						//判断打平的情况
							System.out.println("你:石头------电脑:石头    PK:很幸运打平手");
						}
						else if(x==2){
							System.out.println("你:剪刀------电脑:剪刀   PK:很幸运打平手");
						}
						else {
							System.out.println("你:布------电脑:布    PK:很幸运打平手");
						}  																													/*   打平手的判断END*/
					}
					else if(x==1&&y==2||x==2&&y==3||x==3&&y==1){           					 //开始判断赢的情况
						if(x==1&&y==2){
							System.out.println("你:石头------电脑:剪刀    PK:恭喜您,赢了!");
						}
						else if(x==2&&y==3){
							System.out.println("你:剪刀------电脑:布   PK:恭喜您,赢了!");
						}
						else {System.out.println("你:布------电脑:石头    PK:恭喜您,赢了!");
						} //判断赢的情况END
					}
					else {//开始判断输的情况
						if(x==1&&y==3){
							System.out.println("你:石头------电脑:布    PK:很遗憾,输了!");
						}
						else if(x==2&&y==1){
							System.out.println("你:剪刀------电脑:石头    PK:很遗憾,输了!");
						}
						else {
							System.out.println("你:布------电脑:剪刀    PK:很遗憾,输了!");
						}
					}//判断输的情况E
					System.out.println("是否继续？!(y/n)");
					Answer =input.next();
				}     
			}while(!"n".equals(Answer));
			//break;
		case 2:
			System.out.println("猜数游戏");
			break;
		case 3:
			System.out.println("疯狂7道题");
			break;
		case 4:
			System.out.println("----冒泡排序游戏-----");
			String Answer1 = null;
			do{
				System.out.println("----请输入需排序数字的个数----");
				int n = input.nextInt();
				int  data [ ] = new int[n];
				int temp;

				System.out.println("----请任意输入"+n+"个整数----");
				for( int i =0; i<data.length ;i++){
					data [ i ] = input.nextInt();
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
				Answer1 =input.next();
			}while(!"n".equals(Answer1));
		case 5:
			int s=input.nextInt();
			for(int i=0;i<s;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j+"*"+i+"="+i*j+" ");
				}
				System.out.println("");
				//break;
				//default:
				//System.out.println("--没有这个选项（输入1~3）");
				//break;
			}	
		}
	}
}


