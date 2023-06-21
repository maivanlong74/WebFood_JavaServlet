package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bo.phanhoibo;

/**
 * Servlet implementation class phanhoi
 */
@WebServlet("/phanhoi")
public class phanhoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public phanhoi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	     response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		khachhangbean kh = (khachhangbean)session.getAttribute("kh");
		try {
			if(kh!=null) {
				long makh = kh.getMakh();
				System.out.println("-----------------------------------------------");
				System.out.println(makh);
				System.out.println("-----------------------------------------------");
				String noidung = request.getParameter("noidung");
				phanhoibo phbo = new phanhoibo();
				phbo.Them(makh, noidung);
				System.out.println(makh);
				System.out.println(noidung);
				RequestDispatcher rd = request.getRequestDispatcher("trangchu");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd=request.getRequestDispatcher("ktdn");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
