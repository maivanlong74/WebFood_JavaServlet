package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.sanphamdao;

/**
 * Servlet implementation class phantrang
 */
@WebServlet("/phantrang")
public class phantrang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public phantrang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sanphamdao spdao = new sanphamdao();
		int demtrang = spdao.dem();
		int page = demtrang/9;
		System.out.print(page);
		if(demtrang % 9 != 0) {
			page++;
		}
		System.out.print("---------------------------------");
		System.out.print(page);
		request.setAttribute("dem", page);
		RequestDispatcher rd=request.getRequestDispatcher("sanpham.jsp");
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
