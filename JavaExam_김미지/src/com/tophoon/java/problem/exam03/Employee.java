package com.tophoon.java.problem.exam03;
/*
 * 4. Employee 클래스를 아래와 같이 생성하시오.
필드 (Field): int 사원번호, String 이름, String 부서명, String 직급 (필드의 접근지정자는 모두 default 사용)
생성자 (Constructor): 기본생성자, 필드 전체를 초기화하는 생성자 2개 작성
메소드 (Method): 필드 전체를 출력하는 printInfo() 작성
출력예시)
사원번호: 1
이름: 홍길동
부서명: 개발1팀
직급: 부장
 */

public class Employee {
	int num;					//사원번호
	String name;				//이름
	String Department;			//부서명
	String rank;				//직급
		
	public Employee() {
		
	}

	public Employee(int num, String name, String department, String rank) {
		this.num = num;
		this.name = name;
		Department = department;
		this.rank = rank;
	}
	
	public void printInfo() {
		System.out.println("사원번호: " + num);
		System.out.println("이름: " + name);
		System.out.println("부서명: " + Department);
		System.out.println("직급: " + rank);
		System.out.println();
	}
	
	

}
