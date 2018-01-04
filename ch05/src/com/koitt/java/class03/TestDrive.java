package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		// 고양이 케이 생성
		Cat kei = new Cat("케이", 1);
		// 주인 예은 생성 - 강예은이 kei라는 고양이를 소유한다.
		Cat[] cats = new Cat[2];
		cats[0] = new Cat("일냥이",3);
		cats[1] = new Cat("이냥이",2);
		Owner yeEun = new Owner("강예은", "서울", cats);

		// 주인이 소유한 고양이를 소개하는 메소드 호출
		yeEun.introCat();

		// 고양이 해피 생성
		Cat happy = new Cat("해피", 5);
		// 주인 길동 생성 - 홍길동이 happy라는 고양이를 소유한다.
		Cat[] cats2 = new Cat[3];
		cats2[0] = new Cat("삼냥이",4);
		cats2[1] = new Cat("사냥이",1);
		cats2[2] = new Cat("오냥이",1);
		Owner hong = new Owner("홍길동", "율도국", cats2);

		// 주인이 소유한 고양이를 소개하는 메소드 호출
		hong.introCat();
		
		//분양받을 고양이생성
		Cat nana = new Cat ("나나", 1);
		
		//주인이 새로 고양이를 분양받는다
		hong.setCat1(cats);
		
		// 주인이 소유한 고양이를 소개하는 메소드 호출
		hong.introCat();

	}

}
