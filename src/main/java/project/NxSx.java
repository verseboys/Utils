package project;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 逆序升序排列字符
 * @author verseboys
 *
 */
public class NxSx {

/**
 * 主函数
 * @param args
 */
	public static void main(String[] args) {
		char [ ] charactor = { 'a','c','u','b','e','p','f','z'};
		System.out.println("方法一：");
		System.out.println("原字符序列：");
		for(int i=0;i<charactor.length;i++){
			System.out.print(charactor[i]+" ");      //+"连接符"，加个空格
		}
		Arrays.sort(charactor);
		System.out.println("\n升序排列后：");
		for(int i=0;i<charactor.length;i++){
			System.out.print(charactor[i]+" ");
		}
		System.out.println("\n逆序排列后：");
		for(int i=charactor.length-1;i>=0;i--){
			System.out.print(charactor[i]+" ");
		}
	}
}
