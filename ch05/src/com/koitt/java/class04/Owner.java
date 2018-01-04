package com.koitt.java.class04;

import obj.constructor.Car;

/*
 * Owner(주인)는 Car(차)을 하나씩 가질 수 있다.
 */
public class Owner {

	private String name; // 주인 이름
	private String address; // 주인 주소
	private Car[] car; // 주인이 소유한 차
	private Car car1; // 주인이 소유한 차

	public Owner(String name, String address, Car[] car) {
		this.name = name;
		this.address = address;
		this.car = car;
	}

	public Owner(String name, String address, Car car1) {
		this.name = name;
		this.address = address;
		this.car1 = car1;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public Car getCar1() {
		return car1;
	}

	public void setCar(Car car1) {
		this.car1 = car1;
	}

	// 주인이 소유한 차 소개하는 메소드
	public void introCar() {
		if (car != null && car.length > 0) {
			if (car1 == null) {
				System.out.println(name + "의 차종은 ");
				for (int i = 0; i < car.length; i++) {
					System.out.println(car[i].getBrandName() + "이고, 최고 속력은 " + car[i].getMaxSpeed() + "km/h 입니다.");
				}
				System.out.println("총 차량은 " + car.length + "대 입니다.");
			}
		}
		if (car1 != null) {
			System.out.println(name + "의 차종은 ");
			System.out.println(car1.getBrandName() + "이고, 최고 속력은 " + car1.getMaxSpeed() + "km/h 입니다.");
			System.out.println("총 차량은 " + 1 + "대 입니다.");

		}

	}

}
