package project;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 排序
 * @author verseboys
 *
 */
public class Paixu {                            
	//类名首字母和第二个单词首字母需大写
	public static void main(String[] args) {
		int [ ] scores = new int [5];            //成绩数组
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要排序的字母：");   //循环录入学员成绩
		for(int j = 0; j<scores.length; j++){
			scores[j] = input.nextInt();
		}
		System.out.println("原字符序列：");
		for(int j = 0;j<scores.length;j++){
			System.out.print(scores[j]+" "); //+"连接符"，加个空格
		}
		Arrays.sort(scores);
		System.out.println("\n升序排列后：");
		for(int j=0;j<scores.length;j++){
			System.out.print(scores[j]+" ");
		}
		System.out.println("\n逆序排列后：");
		for(int j1=scores.length-1;j1>=0;j1--){
			System.out.print(scores[j1]+" ");
			input.close();
		}
	}
}
