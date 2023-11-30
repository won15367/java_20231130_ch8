package com.won15367.ch10_1;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	int a = 0;
	int b = 1;
	
	try {
		int c = b/a;
		System.out.println(c);
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		System.out.println("끝");		
	}
				
	int[] arr = {1,2,3};
	
	try {
		System.out.println(arr[3]);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("끝");
	
	ThrowTest throwTest = new ThrowTest();
	throwTest.div(0);
	
	}
	
	
	

}
