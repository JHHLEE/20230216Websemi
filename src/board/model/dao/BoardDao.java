package board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.model.vo.BoardVo;
import common.JDBCTemplate;

public class BoardDao {

	public int insertBoard(Connection conn) {
		int result = -1;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO BOARD_TBL VALUES((select MAX(idx)+1 from board_tbl),'?','?','?',SYSDATE)";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"writer");
			pstmt.setString(2,"subject");
			pstmt.setString(3,"cont");
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
	
	
	
	
	
	public List<BoardVo> getBoardlist(Connection conn){
		List<BoardVo> result = null;
		String sql = "select IDX,WRITER,SUBJECT,CONT,REGDATE from board_tbl order by idx desc";
				
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		result = new ArrayList<BoardVo>();
		while(rs.next()) {
			System.out.println("vo읽기");
			BoardVo vo = new BoardVo();
			vo.setIdx(rs.getInt("idx"));
			vo.setSubject(rs.getString("subject"));
			vo.setWriter(rs.getString("writer"));
			vo.setCont(rs.getString("cont"));
			vo.setRegdate(rs.getTimestamp("regdate"));
			result.add(vo);
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			
		}
		System.out.println("DAO값" + result); 
		
		return result;
	}
		
}
