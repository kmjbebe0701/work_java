package com.koitt.java.exception02;

import java.util.List;
import java.util.Scanner;

public class PersonController {

	private PersonService service;
	private Scanner input;

	public PersonController() {

		// PersonService를 이용하기 위해 객체 생성
		this.service = new PersonService();
		// 사람 정보를 입력받기 위해 객체생성
		this.input = new Scanner(System.in);
	}

	public static void main(String[] args) {
		PersonController controller = new PersonController();
		Scanner input = new Scanner(System.in);
		

		while (true) {
			System.out.println("===인적사항 관리 프로그램==");
			System.out.println("1. 인적사항 입력");
			System.out.println("2. 인적사항 전체출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴번호 입력> ");
			
			int menu = input.nextInt();
			
			switch(menu) {
			case 1:
				controller.menuAdd();
				break;
				
			case 2:
				controller.menuRead();
				break;
				
			case 3:
				System.out.println("프로그램 종료 하겠습니다. 안녕히계세요~");
				System.exit(0);		//프로그램 종료, 0: 정상종료, -1: 비정상종료
				//exit의 숫자는 운영체제가 사용
				break;
				
			}

		}

	}

	public void menuAdd() {
		System.out.println("===사람 정보를 입력해 주세요 (quit: 종료)===");
		System.out.print("이름: ");
		String name = this.input.next();
		System.out.print("나이: ");
		int age = this.input.nextInt();

		// 입력 받은 정보를 객체화
		Person p = new Person(name, age);

		// Service로 입력받은 사람객체를 전달(추가)
		try {
			this.service.add(p);
			System.out.println("입력완료!!");
		} 
		catch (MyException e) {
			//Dao에서 발생한 예외를 service를 거쳐 여기까지 온 다음 출력
			System.out.println(e.getMessage());
		}

	}
	
	public void menuRead() {
		System.out.println("===인적사항 전체 목록 ===");
		
		//Service를 통해 list에 담긴 인적사항 하나하나 출력하기
		List<Person> list = this.service.read();
		
		//for-each문
		for (Person item:list) {
			System.out.println(item);
		}
	}

}
