package projectone;
import java.util.Arrays;
import java.util.Scanner;
public class SR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [ ] scores = new int [28];//�ɼ�����
		 Scanner input = new Scanner(System.in);
		 System.out.println("������Ҫ�������ĸ��");
		    //ѭ��¼��ѧԱ�ɼ�
		 for(int i = 0; i<scores.length; i++){
		      scores [ i ] = input.nextInt();
		    }
		Arrays.sort(scores);
        System.out.println("\n�������к�");
        for(int i=0;i<scores.length;i++){
        	  System.out.print(scores[i] + " ");
          }
	}

}
