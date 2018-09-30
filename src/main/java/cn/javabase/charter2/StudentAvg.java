package cn.javabase.charter2;

import java.util.*;                                           //第一步，导包
/**
 * 输入成绩，输出平均分
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
 * 计算平均分
 */
	public static void StudentAvg() {

		int score;                                                          //先定义需要定义的变量。
		int sum=0;
		double avg = 0.0;
		Scanner input = new  Scanner(System.in);     //声明
		System.out.print("输入学生姓名：");                //交互
		String name = input.next();                               //录入交互声明
		for(int i=0; i<5;i++ ){                                        //逻辑for“当到型循环”
			System.out.print("请输入5门功课中的第"+ (i+1) +"门课的成绩:");
			score = input.nextInt();                                  //录入交互声明	
			sum = sum + score;                                       //注：print()内(中文输入要及其注意。
		}
		avg = (double)sum / 5;
		System.out.print(name+"的平均分是："+avg);

	}
		
	/**
	 * 拓展为计算机
	 */
	private static void  printer() {
		System.out.println("我是李想！！！！我喜欢学习@@，我数学很棒");
		int n=1+1+111111+10000+200000+3000*235;
		System.out.println("1+1+111111+10000+200000+3000等于"+n);
		
	}
		
	
	/**
	 * 打印九九二乘法   九九二乘法算法演示
	 */
	public static void squareLaw () {
		System.out.print("九九二乘法");
		System.out.print("请输入行数");
		Scanner input=new Scanner (System.in);
		int s=input.nextInt();
		for(int i=0;i<s;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");         //("\t"增加后才能对齐。。。。）
			}
			System.out.println("");
			input.close();
		}
	}
	
	/**示例10
	 * 传值找数组下表和数组排序
	 * @param args
	 */
	public static void ArrayShow() {
		
		int[] arr={1,2,2,3,5};
		Arrays.sort(arr);
		
	}
	

	/**整形除法
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
	 * 求数组中最小值
	 * @author verseboys
	 *
	 */
	public static void Maximum() {
		double[] list1 = {-1,10,0,1,5,5,8,4,7,0,-8,6,5,100}; 
		System.out.print("需要找出最小值的数组是：");
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
		System.out.println("\n"+"最小值为：" + min + "         最小值下标为： " + index);  
	
	}
	
	
	
	/**
	 * 升序排序
	 */
	
	public static void Srr() {
		String [ ] scores = new String [26];//成绩数组
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要排序的字母：");		    //循环录入学员成绩
		for(int j=0;j<scores.length;j++){
			scores[j] = input.next();
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
	
	
	/**
	 * 循环录入并排序
	 * @author verseboys
	 *
	 */
	public static void LoopInAndSort() {
		int [ ] scores = new int [28];//成绩数组
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要排序的字母：");//循环录入学员成绩
		for(int i = 0; i<scores.length; i++){
			scores [ i ] = input.nextInt();
		}
		Arrays.sort(scores);
		System.out.println("\n升序排列后：");
		for(int i=0;i<scores.length;i++){
			System.out.print(scores[i] + " ");
		}
		
	}
	
	/**
	 * 图像打印（直三角，倒三角，）
	 * @author verseboys
	 *
	 */
	public static void Printpic() {
		System.out.print("请选择拼图游戏：1.直角三角形，2等腰三角形，3倒角三角形");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch (a){
		case 1:
			System.out.print("请输入直角三角形的行数");
			int rows=input.nextInt();
			System.out.println("以下为直角三角形：");
			System.out.println("*");
			for(int  i=0;i<=rows;i++){       //i=0,下一次进入该for才“+1”，
				for(int j=0;j<=i;j++){        //j=0,下一次进入才"+1"
					System.out.print("*");
				}
				System.out.println("*");   
			}
			break;
		case 2:
			System.out.print("请输入等腰三角形的行数");
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
			System.out.print("请输入倒角三角形的行数");
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
	 * 平均分计算
	 */
	public static void Avescorecal() {
		int score;                                                  //先定义需要定义的变量。
		int sum=0;
		double avg = 0.0;
			    Scanner input = new  Scanner(System.in);  //声明
		        System.out.print("输入学生姓名：");           //交互
				String name = input.next();                        //录入交互声明
				for(int i=0; i<5;i++ ){                                  //逻辑for“当到型循环”
					System.out.print("请输入5门功课中的第"+ (i+1) +"门课的成绩:");//注：print()内(中文输入要及其注意。
					score = input.nextInt();                        //录入交互声明	
					sum = sum + score;
				}
				avg = (double)sum / 5;
						System.out.print(name+"的平均分是："+avg);
	}
	/**
	 * 循环次数的测试
	 */
	public static void circulation() {
		for (int i = 0; i < 3; i++) {
			if (i<2) {
				System.out.println("i小于2");
				break;
			}
			if (i>0) {
				System.out.println("i大于0");
				continue;
			}
		}
	}
	
	
	
	public static void EuclideanAlgorithm() {
		
	}
}


