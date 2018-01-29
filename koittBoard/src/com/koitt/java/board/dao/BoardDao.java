package com.koitt.java.board.dao;

import java.sql.SQLException;
import java.util.List;

import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;
import com.koitt.java.util.DBManager;

public class BoardDao {
	
	public BoardDao() {}

	public void insert(Board board) throws SQLException {
		DBManager.getInstance().insert(board);
	}
	
	public List<Board> selectAll() throws SQLException {
		return DBManager.getInstance().selectAll();
	}
	
	public void delete(Board board) throws SQLException, BoardException {
		if (isExist(board)) {
			DBManager.getInstance().delete(board);
		}
		else {
			throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
		}
	}
	
	public void update(Board board) throws SQLException, BoardException {
			if (isExist(board)) {
				DBManager.getInstance().update(board);
			}
			else {
				throw new BoardException("E03: 수정할 게시글이 존재하지 않습니다.");
			}
		
			
			
	}
	
	// 1. 해당 글이 존재하는지 여부 확인 메소드
	public boolean isExist(Board board) throws SQLException {
		List<Board> list = DBManager.getInstance().selectAll();
		 for(Board item: list) {
			 if(item.equals(board)) {
				 return true;
			 }
		 }
		return false;	// 다 찾아봤는데 없어서 false 리턴
	}
}