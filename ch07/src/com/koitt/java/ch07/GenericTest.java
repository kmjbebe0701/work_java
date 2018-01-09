package com.koitt.java.ch07;
/*
 * 관례
 *  - T: type
 *  - E:element
 */

public class GenericTest<T> {
	
	public boolean myEqual(T a, T b) {
		return a.equals(b);
	}
	
	public boolean myEqual2(String a, String b) {
		return a.equals(b);
	}
	
	public boolean myEqual2(Integer a, Integer b) {
		return a.equals(b);
	}

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hi";
		Integer c = 1;
		Integer d = 2;
		
		//String타입을 이용하는,myEqual메소드를 호출 할 수 있게 된다.
		GenericTest<String> test = new GenericTest<String>();
		boolean isEqual = test.myEqual(a, b);
		System.out.println(isEqual);
		//숫자 끼리 비교
		GenericTest<Integer> test1 = new GenericTest<Integer>();
		boolean isEqual1 = test1.myEqual(c, d);
		System.out.println(isEqual1);
		
		//글자 숫자 모두 들어 갈 수 있다.
		GenericTest<Object> test2 = new GenericTest<Object>();
		boolean isEqual2 = test2.myEqual(a, c);
		System.out.println(isEqual2);
		

	}

}
