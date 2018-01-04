package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		Car[] ram = new Car[1] ;
		ram[0] = new Car("람보르기니", 250);
		Owner miji = new Owner("김미지", "서울", ram);

		
		miji.introCar();

		
		Car all = new Car("올란도", 190);
		Car[] cars = new Car[3];
		cars[0] = new Car ("올란도", 190);
		cars[1] = new Car ("페라리", 300);
		cars[2] = new Car ("포르쉐", 250);
		
		Owner mini = new Owner("박민희", "광주", cars);

		mini.introCar();
		
		Car bmw = new Car("BMW", 220);
		
		Car[] cars2 = new Car[2];
		cars2[0] = new Car ("푸조", 270);
		cars2[1] = new Car ("쉐보레", 190);
		
		mini.setCar(cars2);
		
		mini.introCar();
		miji.setCar(bmw);
		
		miji.introCar();
	}

}
