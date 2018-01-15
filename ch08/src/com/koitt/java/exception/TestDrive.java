package com.koitt.java.exception;

public class TestDrive {

	public static void main(String[] args) {
		CallForName object = new CallForName();
		// CallForName에서 예외를 전달받았으므로 예외처리를 해줘야한다.
		try {
			object.call();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("예외가 정상적으로 처리");
	}
}
