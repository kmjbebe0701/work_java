package com.tophoon.java.problem.exam03;
/*
 * 1. 패키지(Package) com.tophoon.java.problem.exam03을 생성하시오.
2. 클래스(Class) Exam03를 생성하시오.
3. Exam03 클래스에 main 메소드(Method)를 작성하시오.
4. Employee 클래스를 아래와 같이 생성하시오.
필드 (Field): int 사원번호, String 이름, String 부서명, String 직급 (필드의 접근지정자는 모두 default 사용)
생성자 (Constructor): 기본생성자, 필드 전체를 초기화하는 생성자 2개 작성
메소드 (Method): 필드 전체를 출력하는 printInfo() 작성
5. main 메소드에 아래와 같이 작성하시오.
- 기본 생성자로 Employee 객체 생성 후, [1, 홍길동, 개발1팀, 부장]으로 초기화
- 필드 전체를 초기화하는 생성자 이용하여 Employee 객체 생성 [2, 김영희, 개발2팀, 대리]
- 각 객체의 메소드 printInfo()를 이용하여 출력
출력예시)
사원번호: 1
이름: 홍길동
부서명: 개발1팀
직급: 부장
 */

public class Exam03 {

	public static void main(String[] args) {
		Employee hong = new Employee();
		hong.num = 1;
		hong.name = "홍길동";
		hong.Department = "개발1팀";
		hong.rank = "대리";
		
		Employee kim = new Employee(2, "김영희", "개발2팀", "대리");
		
		hong.printInfo();
		kim.printInfo();
		

	}

}
