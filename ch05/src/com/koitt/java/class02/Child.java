package com.koitt.java.class02;

//Child 클래스는 Parent 클래스를 상속받는다.
public class Child extends Parent{
	
	//Child 클래스의 생성자
	public Child() {
		//부모의 생성자중 하나는 무조건 호출이 되어야함. (기본 생성자가 없으면 ()속에 파라메터를 입력)
		super();		//부모의 기본 생성자 호출: 미 작성시 컴파일러가 자동으로 추가한다
		System.out.println("Child() 기본 생성자 호출...");
	}
	
	public Child(String msg) {
		super();		//부모의 기본 생성자 호출: 미 작성시 컴파일러가 자동으로 추가한다
		System.out.println("Child(String) 생성자 호출...\n메세지 : " + msg);
	}
	
	public Child(int num) {
		//super(num);
		this("화이팅!");
		System.out.println("Child(int num) 생성자 호출...\nnum : " + num);
	}

}
