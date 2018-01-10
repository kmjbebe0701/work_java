package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> setA = new HashSet<Integer>();
		HashSet<Integer> setB = new HashSet<Integer>();
		
		setA.add(3);
		setA.add(5);
		setA.add(7);
		setA.add(8);
		setA.add(7);
		setA.add(9);
		System.out.print("A = ");
		print(setA);					//중복된 데이터는 삭제, 하나만 저장된다.
		//println 에서 자동으로Argument로 전달받은 객체의 toString 메소드를 호출한다.
		System.out.println(" A = " + setA.toString());
		
		setB.add(5);
		setB.add(3);
		setB.add(2);
		System.out.print("B = ");
		print(setB);
		System.out.println(" B = " + setB);		//입력 순서에 상관없이 오름차순으로 정렬
		
		boolean isChanged = setA.removeAll(setB); 		//A에서 B에 있는 모든 데이터 삭제(B와 중복된 데이터//A-B)
		//A의 결과가 바뀌면 true 로 아래 if 문이 실행됨. 반대의 경우 실행안됨.
		System.out.print("A - B = ");
		if (isChanged) {
			System.out.println(setA);
		}
		
		//for-each 문
		System.out.print("for-each문으로 출력: ");
		for (Integer i : setA) {
			System.out.print(i + " ");
		}

	}
	
	public static void print(HashSet<Integer> s) {
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
	}

}
