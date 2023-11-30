package com.won15367.ch11_1;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Object obj1 = new Object();
		
		obj1 = "korea";
		obj1 = 100;
		
		int[] arr = {1,2,4};
		
		obj1 = arr;
		
		String a = "korea";
		
		if(a.equals(obj1));
		
		
		Object obj2 = new Object();
		System.out.println(obj2);
		System.out.println(obj2.toString());
		
		Date obj3 = new Date();
		System.out.println(obj3);
		System.out.println(obj3.toString());
		String obj3_str = obj3.toString();
		
		
	}

}
