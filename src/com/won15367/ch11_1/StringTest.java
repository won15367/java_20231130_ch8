package com.won15367.ch11_1;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "881218-1234567";
		
		// charAt
		char ssnGender = ssn.charAt(7);
		if (ssnGender == '1') {
			System.out.println("남자");
		}
		
		// indexOf 해당 문자열이 존재하면 시작인덱스를 없으면 -1을 반환
		int re1 = ssn.indexOf("12");
		System.out.println(re1);
		
		// replace
		String str0 = "김길동 김상수";
		System.out.println(str0.replace("김", "홍"));
		
		
		// substring
		String str1 = ssn.substring(4, 9);
		System.out.println(str1);
		
		// math.random
		double num1 = 45 * Math.random() + 1;
		System.out.println((int)num1);
		
		
	}

}
