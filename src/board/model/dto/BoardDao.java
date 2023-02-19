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
		String sql = "select WRITER,SUBJECT,CONTENT,REGDATE from board_tbl";
				
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
			vo.setWriter(rs.getString("writer"));
			vo.setContent(rs.getString("content"));
			vo.setSubject(rs.getString("subject"));
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
