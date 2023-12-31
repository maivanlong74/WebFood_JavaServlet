package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bo.htkhachhangbo;
import bo.khachhangbo;

/**
 * Servlet implementation class trangcanhan
 */
@WebServlet("/trangcanhan")
public class trangcanhan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public trangcanhan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		  response.setCharacterEncoding("utf-8");
		  htkhachhangbo khbo = new htkhachhangbo();
		  HttpSession session=request.getSession();
	      khachhangbean kh = (khachhangbean)session.getAttribute("kh");
	      request.setAttribute("khachhang", khbo.getkh(kh.getMakh()));
	      System.out.println(kh.getTendn());
	      System.out.println(kh.getPass());
		  RequestDispatcher rd=request.getRequestDispatcher("trangcanhan.jsp");
		  rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
