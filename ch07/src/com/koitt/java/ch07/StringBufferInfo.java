package com.koitt.java.ch07;

public class StringBufferInfo {

	public static void main(String[] args) {
		StringBuffer pg = new StringBuffer ("Java");
		
		System.out.println(pg.capacity());
		// 글자 수에 추가용량 16칸을 더해 20칸 배열을 만든다.
		System.out.println(pg.append(" language "));			//뒤에 () 글자 붙이기
		System.out.println(pg.capacity());						//20칸을 초과하지 않으므로 여전히20
		System.out.println(pg.insert(5, "programming "));		
		//5번째에 글자 삽입 0J1a2v3a4 5		//20칸을 초과하여 길이를 대략 2배로 늘린다.
		System.out.println(pg.capacity());						
		//20칸 << 1 + 2 (101000<<1 -> 1010000 + 10 -> 1010010 = 42
		System.out.println(pg);
		System.out.println(pg.replace(0, 4, "Objective-C"));		//0부터 4까지 범위 대신 () 글자 삽입
		System.out.println(pg.substring(0 , 9));					//0부터 9까지 
		System.out.println(pg);
		System.out.println(pg.charAt(10));							//10번째 char 출력
		pg.setCharAt(10, 'D');										//10번째 C를 D로 변경
		
		System.out.println(pg);

	}

}
