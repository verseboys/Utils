package projectone;
import java.util.Scanner;
public class Printpic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("��ѡ��ƴͼ��Ϸ��1.ֱ�������Σ�2����������");
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
	    switch (a){
	    case 1:
		System.out.print("������ֱ�������ε�����");
		Scanner ap =new Scanner (System.in);
		int rows=ap.nextInt();
		System.out.print("����Ϊֱ�������Σ�");
		System.out.println("");
        for(int  i=0;i<=rows;i++){
    	    for(int  j=0;j<=i;j++){
    	    System.out.print("*");
    	    }
    	    System.out.println("*");
    	    
        }
            break;
    	    case 2:
    	    System.out.print("�����뵹�������ε�����");
    	    Scanner api =new Scanner (System.in);
    		int rowsd=api.nextInt();
    	  for(int i=1;i<=rowsd;i++){
    	    for(int j=0;j<rowsd-i;j++){
    	        System.out.print(" ");
    	    }
    	    for(int k=1;k<=i;k++){
    	    	System.out.print("* ");
    	         }
    	    System.out.println("");
     	   // break;
           }
     }
	}
}

