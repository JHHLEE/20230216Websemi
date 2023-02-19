package board.model.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.model.vo.BoardVo;
import common.JDBCTemplate;

public class BoardDao {

	public List<BoardVo> getBoardlist(Connection conn){
		List<BoardVo> result = null;
		String sql = "select WRITER,SUBJECT,CONT,REGDATE from board_tbl";
				
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		result = new ArrayList<BoardVo>();
		while(rs.next()) {
			System.out.println("vo읽기");
			BoardVo vo = new BoardVo();
			vo.setIdx(rs.getInt("Idx"));
			vo.setWriter(rs.getString("Writer"));
			vo.setCont(rs.getString("Cont"));
			vo.setSubject(rs.getString("Subject"));
			vo.setRegdate(rs.getTimestamp("Regdate"));
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
