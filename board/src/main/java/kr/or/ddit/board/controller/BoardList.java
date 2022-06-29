package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardList
 */
@WebServlet("/BoardList")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  //요청데이터 받기
	  //String page = request.getParameter("page");
	  int sPage = 0;	//현재 페이지
	  sPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
		
	  // 한 화면에 출력할 페이지 수
	  int perPage = 2;
	  
	  // 한 화면에 출력할 글 갯수
	  int perList = 5;
	  
	  // 전체 글갯수 조회하기 - service객체 필요 > dao > service > cont
	  
	  // 전체 페이지 수 
	  
	  // 페이지에 표시될 게시글의 시작값 끝값
	  
	  // 페이지에 표시될 페이지번호
		
		
	}

}
