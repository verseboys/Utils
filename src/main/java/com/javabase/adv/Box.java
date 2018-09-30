
package com.javabase.adv;  
/**
 * 
        * @desc: javabasecharter1  
        * @author: verseboys  
        * @createTime: 2018��3��2�� ����11:24:10  
        * @history:  ���͵�ʹ�÷�����������ͷǷ�������������ƣ�����������������������Ͳ����������֡�

�ͷ��ͷ���һ��������������Ͳ�����������Ҳ����һ���������Ͳ������������ö��Ÿ�����һ�����Ͳ�����Ҳ����Ϊһ�����ͱ�����
������ָ��һ�������������Ƶı�ʶ������Ϊ���ǽ���һ��������������Щ�౻��Ϊ���������������������͡�
        * @version: v1.0  
        * @param <T>
 */

public class Box<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("����̳�"));

		System.out.printf("����ֵΪ :%d\n\n", integerBox.get());
		System.out.printf("�ַ���Ϊ :%s\n", stringBox.get());
	}
}
