/**
 * 
 */
package cn.javabase.charter3;

import java.util.Scanner;

/**�ж��Ƿ�������
 * �����Ǵ��ڵ���1����Ȼ���п��Ա������һ��������Ȼ��
 * @author verseboys
 *
 */
public class Sushu {
	Scanner input = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Sushu sushu = new Sushu();
		 sushu.name();
		
	}
	
	public void name() {
		
		System.out.println("��������Ҫ�жϵ����֣�");
		int shu=input.nextInt();
		int i=2,flag=0;

		if (shu>1) {    //�ж�ʱ�򣬲���дshu>=1  Ӧ��д
			while(flag==0&&i<shu||shu==2){
				if (shu%i==0) {
					flag=1;
				} else {
					i++;
				}
			}
			if (flag==0) {
				System.out.println(shu+"��������");
			}else {
				System.out.println(shu+"������������");
			}

		} else {
			System.out.println("�����Ǵ��ڵ���һ����Ȼ���п��Ա������һ��������!");
			
		}
		returnable();
	}
	public void returnable() {
		System.out.println("�Ƿ��������룿��y/n��");
		String answer=input.next();
		if (answer.equals("y")) {
			name();
		}else {
			System.out.println("���˳�ϵͳ��");
		}
		
	}
	
	
}
