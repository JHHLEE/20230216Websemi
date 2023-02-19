package board.model.vo;

import java.sql.Timestamp;

public class CommentVo {
//	이름      널?       유형           
//			------- -------- ------------ 
//			IDX     NOT NULL NUMBER(6)    
//			BDNUM            NUMBER(6)    
//			WRITER  NOT NULL VARCHAR2(20) 
//			CONT             CLOB         
//			REGDATE          TIMESTAMP(6) 
	
	private int Idx;
	private String Writer;
	private String Subject;
	private String Cont;
	private Timestamp Regdate;
	public CommentVo() {
		super();
	}
	public CommentVo(int idx, String writer, String subject, String cont, Timestamp regdate) {
		super();
		Idx = idx;
		Writer = writer;
		Subject = subject;
		Cont = cont;
		Regdate = regdate;
	}
	@Override
	public String toString() {
		return "CommentVo [Idx=" + Idx + ", Writer=" + Writer + ", Subject=" + Subject + ", Cont=" + Cont + ", Regdate="
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
