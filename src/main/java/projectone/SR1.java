package projectone;
import java.util.Arrays;
import java.util.Scanner;
public class SR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [ ] scores = new int [28];//成绩数组
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入要排序的字母：");
		    //循环录入学员成绩
		 for(int i = 0; i<scores.length; i++){
		      scores [ i ] = input.nextInt();
		    }
		Arrays.sort(scores);
        System.out.println("\n升序排列后：");
        for(int i=0;i<scores.length;i++){
        	  System.out.print(scores[i] + " ");
          }
	}

}
