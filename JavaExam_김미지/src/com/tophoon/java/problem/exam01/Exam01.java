package com.tophoon.java.problem.exam01;
/*
 * 1. 패키지(Package) com.tophoon.java.problem.exam01을 생성하시오.
2. 클래스(Class) Exam01를 생성하시오.
3. main 메소드(Method)를 작성하시오.
4. main 메소드 안에 자바의 자료형 중 기본형(Primitive data type)을 아래와 같이 작성하시오.
- 논리형 변수 a 선언 및 true로 초기화
- 문자형 변수 b 선언 및 'A'로 초기화
- 적절한 정수형 변수 c 선언 및 3000000000로 초기화
- 실수형 변수 d, e 선언 및 각각 3.14와 3.1415로 초기화
5. 각 변수들을 System.out.println 메소드를 이용하여 한 줄씩 출력하시오.
 */

public class Exam01 {
	

	public static void main(String[] args) {
		boolean a = true;
		char b = 'A';
		long c = 3000000000L;
		float d = 3.14f;
		double e = 3.1415;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
