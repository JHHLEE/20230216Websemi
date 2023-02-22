package board.model.vo;

import java.sql.Timestamp;

public class BoardVo {
//이름      널?       유형            
//	------- -------- ------------- 
//	IDX     NOT NULL NUMBER(6)     
//	WRITER           VARCHAR2(20)  
//	SUBJECT          VARCHAR2(255) 
//	CONT             CLOB          
//	REGDATE          TIMESTAMP(1)  
		
//	private int Idx;
//	private String Writer;
//	private String Subject;
//	private String Cont;
//	private Timestamp Regdate;

	private int idx;
	private String writer;
	private String subject;
	private String cont;
	private Timestamp regdate;
	public BoardVo(int idx, String writer, String subject, String cont, Timestamp regdate) {
		super();
		this.idx = idx;
		this.writer = writer;
		this.subject = subject;
		this.cont = cont;
		this.regdate = regdate;
	}
	public BoardVo() {
		super();
	}
	@Override
	public String toString() {
		return "BoardVo [idx=" + idx + ", writer=" + writer + ", subject=" + subject + ", cont=" + cont + ", regdate="
				+ regdate + "]";
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
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
}