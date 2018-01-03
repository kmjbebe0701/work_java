package com.koitt.java.class04;

import obj.constructor.Car;

/*
 * Owner(주인)는 Car(차)을 하나씩 가질 수 있다.
 */
public class Owner {
	
	private String name;		//주인 이름
	private String address;		//주인 주소
	private Car car;			//주인이 소유한 차
	
	public Owner(String name, String address, Car car) {
		this.name = name;
		this.address = address;
		this.car = car;
	}
	
	//주인이 소유한 고양이 소개하는 메소드
	public void introCar() {
		System.out.println(name + "의 차종은 " + car.getBrandName() + "이고, 최고 속력은 " 
				+ car.getMaxSpeed() +"km/h 입니다.");
	}
	
}
