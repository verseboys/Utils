package cn.javabase.charter2;

import java.util.*;                                           //��һ��������
/**
 * ����ɼ������ƽ����
 * @author verseboys
 *
 */
public class StudentAvg {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StudentAvg.printer();

	}


/**
 * ����ƽ����
 */
	public static void StudentAvg() {

		int score;                                                          //�ȶ�����Ҫ����ı�����
		int sum=0;
		double avg = 0.0;
		Scanner input = new  Scanner(System.in);     //����
		System.out.print("����ѧ��������");                //����
		String name = input.next();                               //¼�뽻������
		for(int i=0; i<5;i++ ){                                        //�߼�for��������ѭ����
			System.out.print("������5�Ź����еĵ�"+ (i+1) +"�ſεĳɼ�:");
			score = input.nextInt();                                  //¼�뽻������	
			sum = sum + score;                                       //ע��print()��(��������Ҫ����ע�⡣
		}
		avg = (double)sum / 5;
		System.out.print(name+"��ƽ�����ǣ�"+avg);

	}
		
	/**
	 * ��չΪ�����
	 */
	private static void  printer() {
		System.out.println("�������룡��������ϲ��ѧϰ@@������ѧ�ܰ�");
		int n=1+1+111111+10000+200000+3000*235;
		System.out.println("1+1+111111+10000+200000+3000����"+n);
		
	}
		
	
	/**
	 * ��ӡ�žŶ��˷�   �žŶ��˷��㷨��ʾ
	 */
	public static void squareLaw () {
		System.out.print("�žŶ��˷�");
		System.out.print("����������");
		Scanner input=new Scanner (System.in);
		int s=input.nextInt();
		for(int i=0;i<s;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");         //("\t"���Ӻ���ܶ��롣��������
			}
			System.out.println("");
			input.close();
		}
	}
	
	/**ʾ��10
	 * ��ֵ�������±����������
	 * @param args
	 */
	public static void ArrayShow() {
		
		int[] arr={1,2,2,3,5};
		Arrays.sort(arr);
		
	}
	

	/**���γ���
	 * @param args
	 */
	public static void PlasticDivision() {
		
		int a=81;
		int b=21;
		int c=a/b;
		double d=a/b;
		double e=81;
		double f=21;
		double g=e/f;
		System.out.println(c);
		System.out.println(d);
		System.out.println(g);
		if(d>c){
			System.out.println(2222);
		}else {
			System.out.println(11111);
		}
		
		
	}
	
	
	/**
	 * ����������Сֵ
	 * @author verseboys
	 *
	 */
	public static void Maximum() {
		double[] list1 = {-1,10,0,1,5,5,8,4,7,0,-8,6,5,100}; 
		System.out.print("��Ҫ�ҳ���Сֵ�������ǣ�");
		for (double d : list1) {
			System.out.print(+d+",");
		}
		double min = list1[0];  
		int index = 0;  
		for (int i = 1; i < list1.length; i++ )  
		{  
			if (list1[i] < min)  
			{  
				min = list1[i];  
				index = i;  
			}  
		}    
		System.out.println("\n"+"��СֵΪ��" + min + "         ��Сֵ�±�Ϊ�� " + index);  
	
	}
	
	
	
	/**
	 * ��������
	 */
	
	public static void Srr() {
		String [ ] scores = new String [26];//�ɼ�����
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ�������ĸ��");		    //ѭ��¼��ѧԱ�ɼ�
		for(int j=0;j<scores.length;j++){
			scores[j] = input.next();
		}
		// System.out.println("��������");
		//   System.out.println("ԭ�ַ����У�");
		// for(int j1 = 0;j1<scores.length;j1++){
		//  System.out.print(scores[j1]+" ");      //+"���ӷ�"���Ӹ��ո�
		//   }
		Arrays.sort(scores);
		System.out.println("\n�������к�");
		// for(int j1=0;j1<scores.length;j1++){
		//  System.out.print(scores[j1]+" ");
		// }
		//  System.out.println("\n�������к�");
		// for(int j1=scores.length-1;j1>=0;j1--){
		// System.out.print(scores[j1]+" ");
	}
	
	
	/**
	 * ѭ��¼�벢����
	 * @author verseboys
	 *
	 */
	public static void LoopInAndSort() {
		int [ ] scores = new int [28];//�ɼ�����
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ�������ĸ��");//ѭ��¼��ѧԱ�ɼ�
		for(int i = 0; i<scores.length; i++){
			scores [ i ] = input.nextInt();
		}
		Arrays.sort(scores);
		System.out.println("\n�������к�");
		for(int i=0;i<scores.length;i++){
			System.out.print(scores[i] + " ");
		}
		
	}
	
	/**
	 * ͼ���ӡ��ֱ���ǣ������ǣ���
	 * @author verseboys
	 *
	 */
	public static void Printpic() {
		System.out.print("��ѡ��ƴͼ��Ϸ��1.ֱ�������Σ�2���������Σ�3����������");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch (a){
		case 1:
			System.out.print("������ֱ�������ε�����");
			int rows=input.nextInt();
			System.out.println("����Ϊֱ�������Σ�");
			System.out.println("*");
			for(int  i=0;i<=rows;i++){       //i=0,��һ�ν����for�š�+1����
				for(int j=0;j<=i;j++){        //j=0,��һ�ν����"+1"
					System.out.print("*");
				}
				System.out.println("*");   
			}
			break;
		case 2:
			System.out.print("��������������ε�����");
			int rowsd=input.nextInt();
			for(int i=1;i<=rowsd;i++){
				for(int j=0;j<rowsd-i;j++){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					System.out.print("* ");
				}
				System.out.println("");
				// break;
				input.close();
			}
		case 3:
			System.out.print("�����뵹�������ε�����");
			int rowsdn=input.nextInt();
			for(int i=1;i<=rowsdn;i++){
				for(int j=0;j<rowsdn-i;j++){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					System.out.print("* ");
				}
				System.out.println("");
				// break;
				input.close();
			}
		}
	}
	
	
	
	/**
	 * ƽ���ּ���
	 */
	public static void Avescorecal() {
		int score;                                                  //�ȶ�����Ҫ����ı�����
		int sum=0;
		double avg = 0.0;
			    Scanner input = new  Scanner(System.in);  //����
		        System.out.print("����ѧ��������");           //����
				String name = input.next();                        //¼�뽻������
				for(int i=0; i<5;i++ ){                                  //�߼�for��������ѭ����
					System.out.print("������5�Ź����еĵ�"+ (i+1) +"�ſεĳɼ�:");//ע��print()��(��������Ҫ����ע�⡣
					score = input.nextInt();                        //¼�뽻������	
					sum = sum + score;
				}
				avg = (double)sum / 5;
						System.out.print(name+"��ƽ�����ǣ�"+avg);
	}
	/**
	 * ѭ�������Ĳ���
	 */
	public static void circulation() {
		for (int i = 0; i < 3; i++) {
			if (i<2) {
				System.out.println("iС��2");
				break;
			}
			if (i>0) {
				System.out.println("i����0");
				continue;
			}
		}
	}
	
	
	
	public static void EuclideanAlgorithm() {
		
	}
}


