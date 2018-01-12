package com.tophoon.java.problem.exam04;
/*
 * 5. 아래와 같이 Person 클래스를 생성하고 1번과 같은 언어 특성을 가지는 메소드 getter, setter를 작성하시오.
- 필드: String name, int age (접근지정자는 1번의 특성에 맞는 접근지정자를 사용할 것)
 */
public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}

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
	

}
