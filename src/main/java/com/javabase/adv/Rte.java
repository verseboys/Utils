package com.javabase.adv;

import java.util.ArrayList;
import java.util.List;

public class Rte {
	
	
	
	public static void main(String[] args){
		Rte.communityListLoad1();
	}
	
	
	 public static void communityListLoad(){
		 List<String> list1 = new ArrayList<String>();
		 list1.add("a");
		 list1.add("b");
		 
		
		 
		 for (String iterable_element : list1) {
			 List<String> dynamicUserList = new ArrayList<>();
			 dynamicUserList.add(iterable_element);
			 System.out.println(dynamicUserList);
		}
	
		 
	 }
	 
	 
	 
	 public static void communityListLoad1(){
		 List<String> list1 = new ArrayList<String>();
		 list1.add("a");
		 list1.add("b");
		 
		for (int i = 0; i < list1.size(); i++) {
			List<String> dynamicUserList = new ArrayList<>();
			 dynamicUserList.add(list1.get(i));
			 System.out.println(dynamicUserList);
		}
		 
		
	
		 
	 }


}
