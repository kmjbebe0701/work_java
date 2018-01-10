package com.koitt.java.ch07;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//제네릭(Generic)
		Vector<Object> data = new Vector<Object>(3);		//3은 배열의 크기, 입력 없으면 기본값으로 정해짐
		//Vector data = new Vector(3);			//경고발생
		
		data.addElement(2012);					//addElement = add 기능 동일
		data.add("년도");
		data.addElement(4.35);
		data.add(2, "목표학점");					
		//insertElementAt = add 기능 동일하지만 인자가다름(add내부에서 insertElementAt 호출해 사용)
		data.insertElementAt("자바강좌", 0);		
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + data.capacity());	//용량출력(입력 값이 배열을 초과하여 용량이 늘어남)
		System.out.println(data.toString());

	}

}
