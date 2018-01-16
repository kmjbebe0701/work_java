package com.koitt.java.board;

import java.util.List;

public class BoardService {
	
	private Integer count = 0;
	private BoardDao dao;
	
	
	public BoardService() {
		dao = new BoardDao();
	}
	
	public void add(Board b) {
		b.setId(++count);
		dao.insert(b);
		
	}
	
	public List<Board> read() {
		return dao.selectAll();
	}
	
	public void remove (Board b) throws BoardException {
		dao.remove(b);
	}
	
	public void upDate(Board b) throws BoardException {
		dao.upDate(b);
	}
	

}
