package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		Car ram = new Car("람보르기니", 200);
		Owner miji = new Owner("김미지", "서울", ram);

		
		miji.introCar();

		
		Car all = new Car("올란도", 170);
		Owner mini = new Owner("박민희", "광주", all);

		mini.introCar();

	}

}
