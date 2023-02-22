package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.dao.BoardDao;
import board.model.service.BoardService;
import board.model.vo.BoardVo;

/**
 * Servlet implementation class Maincontroller
 */
@WebServlet("/")
public class Maincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Maincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("boardlist", new BoardService().getBoardList());
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request,response);
		
		System.out.println("보드리스트 보내기");

		
		
	}

	

}
