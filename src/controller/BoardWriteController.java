package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.BoardVo;

/**
 * Servlet implementation class BoardWriteController
 */
@WebServlet("/boardwrite")
public class BoardWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWriteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("WEB-INF/view/boardwrite.jsp").forward(request,response);
//		System.out.println("boardctrlGet");
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/view/boardwrite.jsp").forward(request,response);
		System.out.println("boardctrlPost");
//		
		int result = new BoardService().insertBoardlist();
		
		if(result == 0){
			System.out.println("글작성완료");
			response.sendRedirect(request.getContextPath()+"/");
		}else{
			System.out.println("글작성실패");
		}
		
//		String writer = request.getParameter("writer");
//		String subject = request.getParameter("subject");
//		String cont = request.getParameter("cont");
//		
//		BoardVo wlist = new BoardVo();
//		wlist.setWriter(writer);
//		wlist.setSubject(subject);
//		wlist.setCont(cont);
		
		
		
		
	}

}
