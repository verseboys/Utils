package project;

import java.util.Arrays;
import java.util.Scanner;
/**
 * �������������ַ�
 * @author verseboys
 *
 */
public class NxSx {

/**
 * ������
 * @param args
 */
	public static void main(String[] args) {
		char [ ] charactor = { 'a','c','u','b','e','p','f','z'};
		System.out.println("����һ��");
		System.out.println("ԭ�ַ����У�");
		for(int i=0;i<charactor.length;i++){
			System.out.print(charactor[i]+" ");      //+"���ӷ�"���Ӹ��ո�
		}
		Arrays.sort(charactor);
		System.out.println("\n�������к�");
		for(int i=0;i<charactor.length;i++){
			System.out.print(charactor[i]+" ");
		}
		System.out.println("\n�������к�");
		for(int i=charactor.length-1;i>=0;i--){
			System.out.print(charactor[i]+" ");
		}
	}
}
