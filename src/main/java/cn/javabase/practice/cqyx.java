package cn.javabase.practice;
import java.util.Random;
import java.util.Scanner;
public class cqyx {
	public static void main(String[ ] args) {
		// TODO Auto-generated method stub
		System.out.println("-----����һ����Ϸ��-----");
		System.out.println("   1.��ȭ��Ϸ");
		System.out.println("   2.������Ϸ");
		System.out.println("   3.���7����");
		System.out.println("   4.ð��������Ϸ");
		System.out.println("   5.�žŶ��˷�");
		System.out.println(" **������Ϸѡ��Ӵ**");
		System.out.println("-------------------");
		Scanner input=new Scanner(System.in);  
		int a=input.nextInt();
		switch(a){
		case 1:
			Scanner ina=new Scanner(System.in);                											//�������뺯��in,Scanner������,������ֵ�õ�
			String Answer = null;
			do{
				System.out.println("--------------��ȭ��Ϸ---------------");
				System.out.println("������һ����ֵ:1��ʯͷ 2������ 3����");             //��ʾ������ֵ
				System.out.println(" ");                                                                               //����
				int x=ina.nextInt();                                                                                         //���û�����X����ֵ
				Random on=new Random();																			//������Ե������ֵ�ĺ���on
				int y=on.nextInt(3)+1;																			//����y���������ֵ��Χ(1--3)

				if(x>=4||x<=0){   																					//�ж��û��Ƿ������1--3��Χ
					System.out.println("��,����ȷ����:1��ʯͷ 2������ 3��������������:"+x); 
				}
				else{                                  																 /*�������ж��û�����x����ֵ Ƕ��if*/

					if(x==y){  
						if(x==1){ 																						//�жϴ�ƽ�����
							System.out.println("��:ʯͷ------����:ʯͷ    PK:�����˴�ƽ��");
						}
						else if(x==2){
							System.out.println("��:����------����:����   PK:�����˴�ƽ��");
						}
						else {
							System.out.println("��:��------����:��    PK:�����˴�ƽ��");
						}  																													/*   ��ƽ�ֵ��ж�END*/
					}
					else if(x==1&&y==2||x==2&&y==3||x==3&&y==1){           					 //��ʼ�ж�Ӯ�����
						if(x==1&&y==2){
							System.out.println("��:ʯͷ------����:����    PK:��ϲ��,Ӯ��!");
						}
						else if(x==2&&y==3){
							System.out.println("��:����------����:��   PK:��ϲ��,Ӯ��!");
						}
						else {System.out.println("��:��------����:ʯͷ    PK:��ϲ��,Ӯ��!");
						} //�ж�Ӯ�����END
					}
					else {//��ʼ�ж�������
						if(x==1&&y==3){
							System.out.println("��:ʯͷ------����:��    PK:���ź�,����!");
						}
						else if(x==2&&y==1){
							System.out.println("��:����------����:ʯͷ    PK:���ź�,����!");
						}
						else {
							System.out.println("��:��------����:����    PK:���ź�,����!");
						}
					}//�ж�������E
					System.out.println("�Ƿ������!(y/n)");
					Answer =input.next();
				}     
			}while(!"n".equals(Answer));
			//break;
		case 2:
			System.out.println("������Ϸ");
			break;
		case 3:
			System.out.println("���7����");
			break;
		case 4:
			System.out.println("----ð��������Ϸ-----");
			String Answer1 = null;
			do{
				System.out.println("----���������������ֵĸ���----");
				int n = input.nextInt();
				int  data [ ] = new int[n];
				int temp;

				System.out.println("----����������"+n+"������----");
				for( int i =0; i<data.length ;i++){
					data [ i ] = input.nextInt();
				}
				System.out.println("�������5�����ǣ�");
				for(int i =0;i<data.length;i++){
					System.out.print(data[ i ]+ " ");
				}
				System.out.println();
				for (int i=1;i<data.length;i++){
					for(int j=0;j<data.length-i;j++){
						if(data[j]>data[j+1]){
							temp=data[j];
							data[j]=data[j+1];
							data[j+1]=temp;
						}
					}
				}
				System.out.println("����������Ϊ��");
				for( int i = 0; i<data.length ;i++){
					System.out.print(data[ i ]+ " ");
				}
				System.out.println();
				System.out.println("�Ƿ񷵻�����!(y/n)");
				Answer1 =input.next();
			}while(!"n".equals(Answer1));
		case 5:
			int s=input.nextInt();
			for(int i=0;i<s;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j+"*"+i+"="+i*j+" ");
				}
				System.out.println("");
				//break;
				//default:
				//System.out.println("--û�����ѡ�����1~3��");
				//break;
			}	
		}
	}
}


