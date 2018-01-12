package com.tophoon.java.problem.exam05;
/*
 * 2. 패키지(Package) com.tophoon.java.problem.exam05을 생성하시오.
3. 클래스(Class) Exam05를 생성하시오.
4. Exam05 클래스에 main 메소드(Method)를 작성하시오.
5. Overloading 클래스를 작성하고 아래와 같이 1번 특성을 가지는 오버로딩 메소드를 구현하시오.
- 정수형 int 변수 2개를 더한 결과를 리턴하는 메소드
- 실수형 double 변수 2개를 더한 결과를 리턴하는 메소드
- 메소드 이름은 add
6. main 메소드에 Overloading 객체 하나를 만들고 5번에서 만든 메소드를 한 번씩 호출하여,
리턴된 결과를 순서대로 출력하시오.
 */

public class Exam05 {

	public static void main(String[] args) {
		Overloading over = new Overloading();
		
		System.out.println(over.add(3, 5));
		System.out.println(over.add(1.2, 3.5));
		
		

	}

}
