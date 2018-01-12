package com.koitt.java.javabean;

import java.io.Serializable;

//자바 빈(Java bean)
public class PersonAuto extends Object implements Serializable{
	
	private String name;
	private int age;
	
	
	//1. 기본 생성자
	public PersonAuto() {
		super();
	}
	
	//2. 생성자 (필드 전체를 초기화) - Alt + Shift + S(Generate Constructor using Fields...)
	public PersonAuto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//3. getter. setter(보통생성자 아래 생성)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	//4. equals, hashCode 자동 완성 - Alt + Shift + S(Generate hashCode and equals...)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		//1.주소값 비교
		if (this == obj)
			return true;
		
		//2. Argument에서 받은 객체가 null 이면 false 리턴
		if (obj == null)
			return false;
		
		//3. Argumane가 this와 같은 클래스를 갖는지 검사(풀 패키지 명 검사)
		if (getClass() != obj.getClass())
			return false;
		
		//4. 필드에 접근하기 위해 다운캐스팅
		PersonAuto other = (PersonAuto) obj;
		
		//5. age값 (=주소값	//정수형은 자신이 (가짜)주소값.) 비교
		if (age != other.age)
			return false;
		
		//6.this 의 name이 null값일때, name값 (주소값) 비교
		if (name == null) {
			// 비교대상의 필드가null이 아니면 다른 객체로 판단
			if (other.name != null)
				return false;
			}
		//7. name 값이 다르면 다른 객체로 판단하여 결과를 리턴
		else if (!name.equals(other.name))
			return false;
		//8. 위 조건을 모두 만족하지 않으면 같은 객체로 판단
		return true;
	}
	//5. toString 자동완성 - Alt + Shift + S(Generate toString()...)
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonAuto [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	
	
	

	public static void main(String[] args) {
		PersonAuto p = new PersonAuto();
		System.out.println(p.getClass());
		PersonAuto p1 = new PersonAuto("홍길동" , 30);
		System.out.println(p1);
		
	}
	
	

}
