package projectone;
import java.util.Scanner;


public class Zxecf {
	public static void main(String[] args) {
		
		System.out.print("�žŶ��˷�");
		System.out.print("����������");
		Scanner AP=new Scanner (System.in);
		int s=AP.nextInt();
		for(int i=0;i<s;i++){
			   for(int j=1;j<=i;j++){
				   System.out.print(j+"*"+i+"="+i*j+"\t");         //("\t"���Ӻ���ܶ��롣��������
			   }
			   System.out.println("");
		}

	}

}
