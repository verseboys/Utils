package projectone;
import java.util.Scanner;


public class Zxecf {
	public static void main(String[] args) {
		
		System.out.print("九九二乘法");
		System.out.print("请输入行数");
		Scanner AP=new Scanner (System.in);
		int s=AP.nextInt();
		for(int i=0;i<s;i++){
			   for(int j=1;j<=i;j++){
				   System.out.print(j+"*"+i+"="+i*j+"\t");         //("\t"增加后才能对齐。。。。）
			   }
			   System.out.println("");
		}

	}

}
