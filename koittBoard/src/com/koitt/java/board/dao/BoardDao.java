package com.koitt.java.board.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;
import com.koitt.java.board.service.BoardService;

public class BoardDao {

	// 데이터베이스 대신 게시글을 저장하는 용도로 사용
	private List<Board> list;
	public static final String fname = "src/com/koitt/java/board/dao/BoardList.dat";

	public BoardDao() {
		this.list = loadFromFile(BoardDao.fname);
		// this.list = new ArrayList<Board>();
		// TODO 6. this.list = loadFromFile(fname);
	}

	// 2.
	public void insert(Board board) throws BoardException {
		for (Board item : this.list) {
			if (item.equals(board)) {
				// 1. 기존 등록된 같은 번호의 게시글이 존재할 경우
				throw new BoardException("E01: 중복된 번호의 게시글입니다.");
			}
		}
		list.add(board);
		saveToFile(list, BoardDao.fname);

		// TODO 3. saveToFile(list, [파일명]);
	}

	// 1.
	public List<Board> selectAll() {
		return this.list;
	}

	// 1. // 2.
	public void delete(Board board) throws BoardException {
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(board)) {
				this.list.remove(this.list.get(i));
				saveToFile(list, BoardDao.fname);
				return;
				// TODO 4. saveToFile(list, [파일명]);
			}
		}

		// 1.
		throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
	}

	// 1. // 2.
	public void update(Board board) throws BoardException {
		for (Board item : this.list) {
			if (item.equals(board)) {
				/*
				 * id: 검색 조건이기 때문에 변경 필요 없음 writer: 기존 작성한 작성자와 동일하다고 가정해서 변경 필요 없음 regDate: 글
				 * 생성일이기 때문에 일자를 변경 필요 없음
				 */
				item.setContent(board.getContent());
				item.setTitle(board.getTitle());
				item.setModiDate(board.getModiDate());
				saveToFile(list, BoardDao.fname);
				// TODO 5. saveToFile(list, [파일명]);
				return;
			}
		}

		// 1.
		throw new BoardException("E03: 수정할 게시글이 존재하지 않습니다.");
	}

	// 1. 해당 글이 존재하는지 여부 확인 메소드
	public boolean isExist(Board board) {
		for (Board item : this.list) {
			if (item.equals(board)) {
				return true; // 글이 존재할 경우 존재한다고 리턴
			}
		}

		return false; // 다 찾아봤는데 없어서 false 리턴
	}

	private void saveToFile(List<Board> list, String filename) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			File f = new File(filename);
			f.createNewFile();

			oos.writeObject(list);

			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/*
	 * TODO 1. private void saveToFile(List<Board> list, String filename) list:
	 * BoardDao에 있는 list필드 filename: list 객체를 저장할 파일 이름
	 */

	@SuppressWarnings("unchecked")
	private List<Board> loadFromFile(String filename) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object list = null;
		try {
			File f = new File(filename);

			if (f.exists()) {

				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);

				list = ois.readObject();

				fis.close();
				ois.close();
			}

			else {
				System.out.println("처음 오셨네요?");
				return new ArrayList<Board>();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return (List<Board>) list;

	}
	/*
	 * TODO 2. private List<Board> loadFromFile(String filename) filename: 게시글 리스트가
	 * 저장된 파일 이름
	 * 
	 * List<Board>: 파일에서 불러온 list객체를 리턴
	 */

	public void countsave() {
		BoardService bs = new BoardService();
		int num = bs.getCount();

		String st = "src/com/koitt/java/board/dao/numberList.dat";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {

			fos = new FileOutputStream(st);
			oos = new ObjectOutputStream(fos);
			File f = new File(st);
			f.createNewFile();

			oos.writeObject(num);

			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Integer countprint() {

		String st = "src/com/koitt/java/board/dao/numberList.dat";

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Integer num = 0;

		try {

			File f = new File(st);
			if (f.exists()) {

				fis = new FileInputStream(st);
				ois = new ObjectInputStream(fis);

				num = (int) ois.readObject();

				fis.close();
				ois.close();
			} else {
				f.createNewFile();
				FileWriter fw = new FileWriter("0");
				
				return 0;
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return num;
	}
}