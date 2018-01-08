package com.koitt.java.ch07;

public class WrapperInteger {
	public static void main(String[] args) {
	Integer age = new Integer(20);
	Integer snum = new Integer("20121105");				//입력내용이 숫자면 자동으로 형변환하여 저장
														//숫자 타입이 아니면 오류발생
	
	System.out.println("나이: " + age.intValue());
	System.out.println("학번: " + snum.intValue());
	System.out.println(age.equals(snum));
	
	System.out.println(Integer.parseInt("24567"));		//String 형으로받은 숫자를 int 형으로 바꿔준다.
	System.out.println(Integer.parseInt("ff", 16));		//16진수로 출력
	System.out.println(Integer.toBinaryString(255));	//2진수로 바꿔서 스트링(String) 타입으로 출력
	System.out.println(Integer.toString(255,16));		//255를 16진수로 바꿔 스트링(String) 타입으로출력
	
	
	
	}

}
