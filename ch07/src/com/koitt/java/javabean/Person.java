package com.koitt.java.javabean;

import java.io.Serializable;

// 자바 빈(Java Bean)
public class Person extends Object implements Serializable{
	
	private String name;
	private int age;
	
	
	//1. 기본 생성자
	public Person() {
		super();
	}
	
	//2. 생성자 (필드 전체를 초기화)
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//3. equals 구현
	@Override
	public boolean equals(Object obj) {
		//3-1 나 자신과Argument의 객체 주소값 비교
		if(this == obj) {
			return true;
		}
		
		//3-2 obj가 현재 클래스를 상속받고 있는지 확인
		if (!(obj instanceof Person)) {
			return false;
		}
		
		//3-3 name 필드값이 같다면 같은 객체로 결과를 리턴
		Person p = (Person) obj;
		if (this.name.equals(p.name)) {
			return true;
		}
		return false;
	}
	
	//4.hashCode 구현 : 객체 하나를 하나의 숫자로 표현하는 메소드 (가짜주소값)
	@Override
	public int hashCode() {
		
		return this.name.hashCode() + this.age;
	}
	
	//5. toString 구현 : 객체의 내용을 문자열로 표현하는 메소드
	@Override
	public String toString() {
		//String a = "name: " + this.name + ", age: " + this.age;
		//StringBuilder 위와 동일
		StringBuilder sb = new StringBuilder();
		sb.append("name: ");
		sb.append(this.name);
		sb.append(", age: ");
		sb.append(this.age);
		//지금까지append한 문자열을 String 타입으로 변환
		String a = sb.toString();

		return a;
	}



	public static void main(String[] args) {
		Person p1 = new Person("철수", 35);
		Person p2 = new Person("영희", 30);
		Person p3 = new Person("철수", 30);
		Person p4 = new Person("가", 20);
		Person p5 = new Person("각", 19);
		
		//1. equals 사용법
		if (p1.equals(p2)) {				//철수와 영희의 이름을 비교
			System.out.println("두사람의 이름은 같다");
		}
		else {
			System.out.println("두사람의 이름은 다르다");
		}
		
		if (p1.equals(p3)) {				//철수와 철수의 이름을 비교
			System.out.println("두사람의 이름은 같다");
		}
		else {
			System.out.println("두사람의 이름은 다르다");
		}
		
		//2.hashCode 값을 출력
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		System.out.println(p5.hashCode());
		
		
		//3. toString 메소드 사용		
		//자동으로 toString 호출하기 때문에 다른 메소드를 안만들고 메소드 오버라이딩한다(편리)
		System.out.println(p1.toString());
		System.out.println(p2);					//println 메소드에서 자동으로 객체의 toString을 호출
		System.out.println(p3.toString());
		System.out.println(p4);
		System.out.println(p5);
		
		
	}

	
	
	

}