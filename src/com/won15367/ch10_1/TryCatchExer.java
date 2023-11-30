package com.won15367.ch10_1;

public class TryCatchExer {
	
	public static void main(String[] args) {
		
		String[] strArray = {"10", "2a"};
		int value =0 ;
	
		for (int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			} catch(NumberFormatException e) {
				System.out.println(e);
			} finally {
				System.out.println(value);
			}
				
		}

	}
	
}