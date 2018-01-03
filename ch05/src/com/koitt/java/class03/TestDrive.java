package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		// 고양이 케이 생성
		Cat kei = new Cat("케이", 1);
		// 주인 예은 생성 - 강예은이 kei라는 고양이를 소유한다.
		Owner yeEun = new Owner("강예은", "서울", kei);

		// 주인이 소유한 고양이를 소개하는 메소드 호출
		yeEun.introCat();

		// 고양이 해피 생성
		Cat happy = new Cat("해피", 5);
		// 주인 길동 생성 - 홍길동이 happy라는 고양이를 소유한다.
		Owner hong = new Owner("홍길동", "율도국", happy);

		// 주인이 소유한 고양이를 소개하는 메소드 호출
		hong.introCat();

	}

}
