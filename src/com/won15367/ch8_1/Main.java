package com.won15367.ch8_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스는 생성자로 객체를 선언할 수 없지만
		// 인터페이스로 구현하고 있는 자식 클래스 객체를 대입받아서 객체를 생성할 수 있다.
		Car car0 = new Bus();
		
		Bus bus1 = new Bus();
		Car car1 = bus1;
		
		car0.accel();
//		car0.tmoney();
		car1.accel();
	
		
	}

}
