package com.koitt.sql;

public class TestDrive {
	
	static {
		/*
		 * TestDrive 클래스는 main메소드를 포함하고 있는데
		 * JAVA 가상머신(VM)이 main부터 실행을 위해
		 * TestDrive 클래스 정보를 메모리에 올려야 하기 때문에 static블록이 실행
		 */
		System.out.println("TestDrive static block 실행...");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		//Class.forName("com.koitt.sql.ExStaticBlock");		//해당클래스에있는static블록만 실행
		new ExStaticBlock();
		new ExStaticBlock();
		new ExStaticBlock("test");

	}

}
