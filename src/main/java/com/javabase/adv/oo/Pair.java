
package com.javabase.adv.oo;  
/**
 * 
        * @desc: javabasecharter1  
        * @author: verseboys  
        * @createTime: 2018年3月2日 上午11:38:19  
        * @history:  
        * @version: v1.0  
        * @param <T>
 */

public class Pair<T> {

	private T value;  
	public Pair(T value) {  
		this.value=value;  
	}  
	public T getValue() {  
		return value;  
	}  
	public void setValue(T value) {  
		this.value = value;  
	} 


	public static void main(String[] args) throws ClassNotFoundException {  
		Pair<String> pair=new Pair<String>("Hello");  
		String str=pair.getValue();  
		System.out.println(str);  
		pair.setValue("World");  
		str=pair.getValue();  
		System.out.println(str);  
	}

}

