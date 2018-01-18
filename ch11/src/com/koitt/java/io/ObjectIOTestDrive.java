package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTestDrive {

	public static void main(String[] args) {
		// 파일에 저장 할 객체 생성
		Person p1 = new Person("홍길동", "서울", 30);
		Person p2 = new Person("홍길순", "부산", 28);
		Person p3 = new Person("홍길자", "전주", 35);

		// 1. Connection Stream, Chain Stream 생성
		ObjectOutputStream oos = null; // Chain Stream
		FileOutputStream fos = null; // connection Stream

		try {
			// person.dat파일을 Destination으로 지정
			fos = new FileOutputStream("person.dat");
			oos = new ObjectOutputStream(fos);

			// Connection Stream을 이용하여 객체를 개울에 띄워 올림
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.writeObject(null); // 더 이상 띄울 객체가 없다는 표현으로 null 입력

			/*
			 * writeObject 메소드가 ObjectOutputStream과 FileOutputStream을 거쳐 person.dat까지 객체를
			 * 보낸다.
			 */

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("객체 정보를 파일에 저장완료 했습니다...");
		
		
		// *****************************************
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("person.dat");
			ois = new ObjectInputStream(fis);
			
			Object item = null;
			while ((item = ois.readObject()) != null) {
				System.out.println(item);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
