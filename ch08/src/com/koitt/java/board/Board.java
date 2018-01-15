package com.koitt.java.board;

import java.util.Date;

public class Board {
	
	int id;				//게시물 번호
	String title;		//제목
	String content;		//내용
	String writer;		//작성자
	Date regDate;		//작성일
	
	
	public Board() {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public boolean equals(Board b) {
		if (this == b)
			return true;
		if (b == null)
			return false;
		if (getClass() != b.getClass())
			return false;
		Board other = (Board) b;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	

}
