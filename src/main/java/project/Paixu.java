package project;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ����
 * @author verseboys
 *
 */
public class Paixu {                            
	//��������ĸ�͵ڶ�����������ĸ���д
	public static void main(String[] args) {
		int [ ] scores = new int [5];            //�ɼ�����
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ�������ĸ��");   //ѭ��¼��ѧԱ�ɼ�
		for(int j = 0; j<scores.length; j++){
			scores[j] = input.nextInt();
		}
		System.out.println("ԭ�ַ����У�");
		for(int j = 0;j<scores.length;j++){
			System.out.print(scores[j]+" "); //+"���ӷ�"���Ӹ��ո�
		}
		Arrays.sort(scores);
		System.out.println("\n�������к�");
		for(int j=0;j<scores.length;j++){
			System.out.print(scores[j]+" ");
		}
		System.out.println("\n�������к�");
		for(int j1=scores.length-1;j1>=0;j1--){
			System.out.print(scores[j1]+" ");
			input.close();
		}
	}
}
