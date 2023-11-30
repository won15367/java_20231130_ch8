package com.won15367.ch11_1;

public class ClazzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = String.class;

		Class phoneClass1 = Phone.class;
		
		try {
			Class phoneClass2 = Class.forName("com.won15367.ch11_1.Phone");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Phone phone = new Phone();
		Class phoneClass3 = phone.getClass();

	}

}
