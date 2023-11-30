package com.won15367.ch8_1;

public interface Car {  // 인터페이스는 생성자 불가
	
	String carName = "소나타";
	// 모든 변수가 초기화가 되어야 하고 상수로 취급이 된다.
	
	public void accel();
	public void handle();
	// 인터페이스에서는 모든 매소드가 내용이 없어야 한다.

}
