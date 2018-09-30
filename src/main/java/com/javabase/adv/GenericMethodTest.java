
package com.javabase.adv; 
/**
 * 
 * @desc: javabasecharter1  
 * @author: verseboys  
 * @createTime: 2018��3��2�� ����11:16:31  
 * @history: �����дһ�����ͷ������÷����ڵ���ʱ���Խ��ղ�ͬ���͵Ĳ��������ݴ��ݸ����ͷ����Ĳ������ͣ��������ʵ��ش���ÿһ���������á�

�����Ƕ��巺�ͷ����Ĺ���

���з��ͷ�����������һ�����Ͳ����������֣��ɼ����ŷָ����������Ͳ������������ڷ�����������֮ǰ�������������е�<E>����
ÿһ�����Ͳ����������ְ���һ���������Ͳ������������ö��Ÿ�����һ�����Ͳ�����Ҳ����Ϊһ�����ͱ�����������ָ��һ�������������Ƶı�ʶ����
���Ͳ����ܱ�������������ֵ���ͣ���������Ϊ���ͷ����õ���ʵ�ʲ������͵�ռλ����
���ͷ��������������������һ����ע�����Ͳ���ֻ�ܴ������������ͣ�������ԭʼ���ͣ���int,double,char�ĵȣ��� 
 * @version: v1.0
 */
public class GenericMethodTest
{
	// ���ͷ��� printArray                         
	public static < E > void printArray( E[] inputArray )
	{
		// �������Ԫ��            
		for ( E element : inputArray ){        
			System.out.printf( "%s ", element );
		}
		System.out.println();
	}

	public static void main( String args[] )
	{
		// ������ͬ�������飺 Integer, Double �� Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println( "��������Ԫ��Ϊ:" );
		printArray( intArray  ); // ����һ����������

		System.out.println( "\n˫����������Ԫ��Ϊ:" );
		printArray( doubleArray ); // ����һ��˫����������

		System.out.println( "\n�ַ�������Ԫ��Ϊ:" );
		printArray( charArray ); // ����һ���ַ�������
	} 
}
