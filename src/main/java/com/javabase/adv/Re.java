package com.javabase.adv;

/**
 * @author Administrator
 *
 */
public class Re {
	
	 private int age;
	    private String name;
	
	
	
	public Re(int age, String name) {
			super();
			this.age = age;
			this.name = name;
			yu();
		}



	public void yu(){
		 String s = "\\C\\h\\a\\i\\n\\i\\n\\g\\.\\d\\b\\3"; 
		 s = s.replace("\\", ""); 
		 System.out.println(s);
	}
	
	public static void main(String[] args) {
		Re re=new Re(5,"ni");
	}
	

}
