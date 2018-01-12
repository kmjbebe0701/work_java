package com.tophoon.java.problem.exam05;
/*
 * 5. Overloading 클래스를 작성하고 아래와 같이 1번 특성을 가지는 오버로딩 메소드를 구현하시오.
- 정수형 int 변수 2개를 더한 결과를 리턴하는 메소드
- 실수형 double 변수 2개를 더한 결과를 리턴하는 메소드
- 메소드 이름은 add
 */

public class Overloading {
	int a;
	int b;
	double c;
	double d;
	
	public int add (int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public double add (double c, double d) {
		double sum = c + d;
		return sum;
	}

}
