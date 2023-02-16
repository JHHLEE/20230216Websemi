package model;

public class Comment {
//	------- -------- ------------ 
//	IDX     NOT NULL NUMBER(6)    
//	BDNUM            NUMBER(6)    
//	WRITER  NOT NULL VARCHAR2(20) 
//	CONTENT          CLOB         
//	REGDATE          TIMESTAMP(6) 

	private int idx;
	private int bdnum;
	private String writer;
	private String content;
	@Override
	public String toString() {
		return "Comment [idx=" + idx + ", bdnum=" + bdnum + ", writer=" + writer + ", content=" + content + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBdnum() {
		return bdnum;
	}
	public void setBdnum(int bdnum) {
		this.bdnum = bdnum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
