package com.won15367.ch11_1;

public class SysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.currentTimeMillis();
		long t1 = System.nanoTime();
		
		
		System.out.println("시작");
		
		
		long t2 = System.nanoTime();
		System.out.println((t2-t1));
		
		
		
		
		System.exit(0);  //  프로그램 강제 종료
		
		System.out.println("종료");

	}

}
