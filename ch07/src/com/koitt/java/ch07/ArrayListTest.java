package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(0.87);					
		list.add("algol");				
		list.add("pascal");				
		list.add(null);					
		list.add(1);				
		list.add("java");				
		list.add(3.4);					
		list.add(5.8);					
		
		Iterator it = list.iterator();		//Iterator 객체를 뽑아냄
		print(it);
		
		//배열로 반환하여 모든 원소 출력 가능
		for (Object e :list.toArray()) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for(int i =0; i<list.size(); i++) {
			Object e = list.get(i);
			System.out.print(e + " ");
		}
		
	}

	public static void print(Iterator it) {
		while (it.hasNext()) {						//it.hasNext 다음이 있니? true 면 메소드 실행
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
	}
}