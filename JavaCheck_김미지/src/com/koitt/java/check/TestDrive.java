package com.koitt.java.check;

import java.util.Scanner;

public class TestDrive {
	LibraryManagement lmt = new LibraryManagement();
	Scanner input;
	
	
	public TestDrive() {
		super();
		this.lmt = lmt;
		this.input = new Scanner(System.in);
	}

	public static void main(String[] args) {

		TestDrive lm = new TestDrive();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("=== KOITT 도서관 ===");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. book정보 출력");
			System.out.println("5. magazine정보 출력");
			System.out.println("6. 서적 수량 출력");
			System.out.println("7. 도서 검색");
			System.out.println("8. 프로그램 종료");
			System.out.print("메뉴번호 입력 > ");

			// 1.
			int menu = -1; 
			try {
				menu = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
				continue; 
			}

			switch (menu) {
			case 1:
				lm.addBook();
				break;

			case 2:
				lm.delBook();
				break;

			case 3:
				// 4.
				lm.showAll();
				break;

			case 4:
				// 4.
				lm.showAllBooks();
				break;

			case 5:
				lm.showAllMagazines();
				break;
				
			case 6:
				lm.size();
				break;
				
			case 7:
				lm.getBook();
				break;
				
			case 8:
				// 1.
				System.out.println("안녕히 가세요~");
				input.close(); // 표준 입출력 종료
				System.exit(0); // 0: 정상종료
				break;

			default:
				System.out.println("메뉴번호를 다시 입력해주세요.");
			}
		
		}
	}
	
	public void addBook() {
		System.out.println("추가할 도서가 책이면B, 잡지면 M을 눌러주세요.");
		String t = input.nextLine();
	}
	
	public void delBook() {
		
	}
	public void showAll() {
		
	}
	public void showAllBooks() {
		
	}
	public void showAllMagazines() {
		
	}
	public void size() {
		
	}
	public void getBook() {
		
	}
	

}
