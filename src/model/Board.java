package model;

public class Board {
	
//	------- -------- ------------- 
//	IDX     NOT NULL NUMBER(6)     
//	WRITER           VARCHAR2(20)  
//	SUBJECT          VARCHAR2(255) 
//	CONTENT          CLOB          
//	REGDATE          TIMESTAMP(1)  
		
	private int idx;
	private String writer;
	private String subject;
	private String content;
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", writer=" + writer + ", subject=" + subject + ", content=" + content + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
