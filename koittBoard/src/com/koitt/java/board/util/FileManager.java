package com.koitt.java.board.util;

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

import com.koitt.java.board.model.Board;
import com.koitt.java.board.service.BoardService;

public class FileManager {
	
	public static void saveToFile(List<Board> list, String filename) {

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
	public static List<Board> loadFromFile(String filename) {
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
