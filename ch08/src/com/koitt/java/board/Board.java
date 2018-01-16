package com.koitt.java.board;

import java.util.Date;

public class Board {

	private Integer id; // 게시물 번호
	private String title; // 제목
	private String content; // 내용
	private String writer; // 작성자
	private Date regDate; // 작성일

	//기본생성자
	public Board() {
		super();
	}

	public Board(String title, String content, String writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = date();
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
	public int hashCode() {
		int i = this.id * (title.hashCode() + 1) * (content.hashCode() + 3) *
				(writer.hashCode() + 7) * (regDate.hashCode() + 5); 
		return i;				
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Board) {
			if (this.getId() == (((Board) obj).getId())) {
				return true;
			}
		}
		return false;
	}
	
	public Date date() {
		Date now = new Date();
		return now;
	}

}
