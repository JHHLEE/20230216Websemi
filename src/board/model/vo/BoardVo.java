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
		
	private int Idx;
	private String Writer;
	private String Subject;
	private String Cont;
	private Timestamp Regdate;
	public BoardVo(int idx, String writer, String subject, String cont, Timestamp regdate) {
		super();
		Idx = idx;
		Writer = writer;
		Subject = subject;
		Cont = cont;
		Regdate = regdate;
	}
	public BoardVo() {
		super();
	}
	@Override
	public String toString() {
		return "BoardVo [Idx=" + Idx + ", Writer=" + Writer + ", Subject=" + Subject + ", Cont=" + Cont + ", Regdate="
				+ Regdate + "]";
	}
	public int getIdx() {
		return Idx;
	}
	public void setIdx(int idx) {
		Idx = idx;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getCont() {
		return Cont;
	}
	public void setCont(String cont) {
		Cont = cont;
	}
	public Timestamp getRegdate() {
		return Regdate;
	}
	public void setRegdate(Timestamp regdate) {
		Regdate = regdate;
	}
	


}