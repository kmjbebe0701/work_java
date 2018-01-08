package com.koitt.java.ch07;

public class StringInfo {

	public static void main(String[] args) {
		String snum = "20123458";
		
		//생성자 오버로딩
		String name = new String("김경석");
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));		//비교시 다를게 없으므로 0출력
		System.out.printf("%d %n", snum.compareTo("20123419"));		//8-6은 2이므로
		System.out.printf("%s ", name);
		System.out.printf("%s ", name.replace('김','강'));			//'김'을 '강'으로 바꾸기(일시적)
		System.out.printf("%s%n ", name);
		System.out.printf("%s ", dept);
		System.out.printf("%s ", dept.substring(0, 3));				//0컴1퓨2터3학4과5 (0~3까지 출력)
		System.out.printf("%d%n ",dept.length());
		System.out.printf("%s ", java.indexOf('a'));				//첫번째 a글자의 위치
		System.out.printf("%s ", java.concat("language"));			//뒤에 ()글자 붙이기(일시적)
		System.out.printf("%s ", java.replace('j', 'J'));			//모든j를J로 변경
		System.out.printf("%s ", java.toUpperCase());				//모든 글자를 대문자로 변경
		System.out.printf("%b ", java.equals("JAVA"));				//대소문자 구분하고 비교
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA"));	//대소문자 구분없이 비교
		System.out.printf("%s%n ", java.substring(1));				//1부터 출력
		

	}

}
