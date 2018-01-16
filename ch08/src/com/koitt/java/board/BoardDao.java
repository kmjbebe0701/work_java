package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list;

	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
	public void insert(Board b) {
		list.add(b);
		
	}
	
	public List<Board> selectAll() {
		return this.list;
	}
	
	public void remove(Board b) throws BoardException {
		for (Board bo : list) {
			if (bo.equals(b)) {
				list.remove(bo);
				return;
			}
		}
		throw new BoardException("E01: 삭제 할 게시물이 없습니다.");
	}
	
	public void upDate (Board b) throws BoardException {
		for (Board bo : list) {
			if (bo.equals(b)) {
				bo.setTitle(b.getTitle());
				bo.setContent(b.getContent());
				bo.setWriter(b.getWriter());
				
				return;
			}
		}
		throw new BoardException("E02: 수정 할 게시물이 없습니다.");
		
	}
	
	
	
	

}
