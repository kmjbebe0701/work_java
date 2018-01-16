package com.koitt.java.board;

import java.util.List;
import java.util.Scanner;


public class BoardController {
	
	private BoardService service;
	private Scanner in;
	
	public BoardController() {
		service = new BoardService();
		in = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		BoardController controller = new BoardController();
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("===게시판 관리 프로그램==");
			System.out.println("1. 게시물 입력");
			System.out.println("2. 게시물 전체출력");
			System.out.println("3. 게시물 삭제");
			System.out.println("4. 게시물 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 입력> ");

			int menu = -1;
			try {
				menu = Integer.parseInt(in.nextLine()); // 한 줄 단위로 입력받음(String 타입)
			}
			catch (NumberFormatException e) {
				System.out.println("메뉴는 숫자로만 입력하세요.");
				continue;
			}

			switch (menu) {
			case 1:
				controller.menuAdd();
				break;

			case 2:
				controller.menuRead();
				break;

			case 3:
				controller.menuRemove();
				break;

			case 4:
				controller.menuUpDate();
				break;

			case 5:
				System.out.println("프로그램 종료 하겠습니다. 안녕히계세요~");
				System.exit(0); // 프로그램 종료, 0: 정상종료, -1: 비정상종료
				// exit의 숫자는 운영체제가 사용
				break;

			}

		}

	}
	
	public void menuAdd() {
		System.out.println("===게시물을 입력해주세요===");
		System.out.print("글 제목: ");
		String title = in.nextLine();
		System.out.print("글 내용: ");
		String content = in.nextLine();
		System.out.print("작성자: ");
		String writer = in.nextLine();
		
		
		Board b = new Board (title, content, writer);
		
		
		service.add(b);
		System.out.println("게시물 등록 완료!!!");
	}
	
	public void menuRead() {
		System.out.println("===인적사항 전체 목록 ===");

		// Service를 통해 list에 담긴 인적사항 하나하나 출력하기
		List<Board> list = this.service.read();

		// for-each문
		for (Board item : list) {
			System.out.println(item);
		}
	}
	
	public void menuRemove() {
		System.out.println("===삭제 할 게시물을 입력해주세요===");
		System.out.print("글 번호: ");
		Integer id = Integer.parseInt(in.nextLine());
		Board b = new Board ();
		b.setId(id);
		
		try {
			service.remove(b);
			System.out.println(b.getId() + "번 게시물이 삭제 되었습니다.");
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}
	public void menuUpDate() {
		System.out.println("===수정 할 게시물을 입력해주세요===");
		System.out.print("글 번호: ");
		Integer id = Integer.parseInt(in.nextLine());
		System.out.print("글 제목: ");
		String title = in.nextLine();
		System.out.print("글 내용: ");
		String content = in.nextLine();
		System.out.print("작성자: ");
		String writer = in.nextLine();
		
		Board b = new Board (title, content, writer);
		b.setId(id);
		
		try {
			service.upDate(b);
			System.out.println(b.getId() + "번 게시물이 수정 되었습니다.");
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
