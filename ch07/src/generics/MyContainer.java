package generics;

import java.util.ArrayList;

public class MyContainer<E> {
	private ArrayList<E> list;
	
	public MyContainer() {
		list = new ArrayList<E>();
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public void add(E element) {
		list.add(element);
	}
	


	public static void main(String[] args) {
		MyContainer<String> pl = new MyContainer<String>();		//E 의 타입이 String으로 정해짐
		pl.add("algol");
		pl.add("C");
		//pl.add(5);				//오류발생
		pl.add("java");
		System.out.println(pl.get(0) + " ");
		System.out.println(pl.get(1) + " ");
		System.out.println(pl.get(2) + " ");

	}

}
