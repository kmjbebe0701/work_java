package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<> ();
		
		list.add("pascal");									//pascal
		((LinkedList<Object>)list).addLast(1);				//pascal 1
		list.add("java");									//pascal 1 java
		((LinkedList<Object>)list).addLast(3.4);			//pascal 1 java 3.4
		((LinkedList<Object>)list).addFirst("algol");		//algol pascal 1 java 3.4
		((LinkedList<Object>)list).addFirst(0.87);			//0.87 algol pascal 1 java 3.4
		list.add(3,null);									//0    1     2      3 세번째에 null 추가
		((LinkedList<Object>)list).addLast(5.8);			//0.87 algol pascal null 1 java 3.4
		
		Iterator<Object> it = list.iterator();		//Iterator 객체를 뽑아냄
		print(it);
		print(((LinkedList<Object>)list).descendingIterator());	//거꾸로 출력(배열의 끝부터 출력)
		
		//배열로 반환하여 모든 원소 출력 가능
		for (Object e :list.toArray()) {
			System.out.print(e + " ");
		}
		System.out.println();
		
	}
	
	public static void print (Iterator<Object> it) {
		while (it.hasNext()) {						//it.hasNext 다음이 있니? true 면 메소드 실행
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

}
