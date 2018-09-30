package projectone;

import java.util.Arrays;
import java.util.Scanner;

public class Srr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String [ ] scores = new String [26];//成绩数组
		   Scanner input = new Scanner(System.in);
		    System.out.println("请输入要排序的字母：");
		    //循环录入学员成绩
		    for(int j=0;j<scores.length;j++){
//		    	scores[j] = (String) input.nextInt();
		    }
		    	 // System.out.println("方法二：");
		       //   System.out.println("原字符序列：");
		     // for(int j1 = 0;j1<scores.length;j1++){
		        	//  System.out.print(scores[j1]+" ");      //+"连接符"，加个空格
		       //   }
		          Arrays.sort(scores);
		          System.out.println("\n升序排列后：");
		      // for(int j1=0;j1<scores.length;j1++){
		        	//  System.out.print(scores[j1]+" ");
		         // }
		        //  System.out.println("\n逆序排列后：");
		       // for(int j1=scores.length-1;j1>=0;j1--){
		        	 // System.out.print(scores[j1]+" ");
		    }     
	}


