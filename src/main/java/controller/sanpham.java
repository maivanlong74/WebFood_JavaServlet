package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.sanphambean;
import bo.loaibo;
import bo.sanphambo;
import dao.sanphamdao;

/**
 * Servlet implementation class sanpham
 */
@WebServlet("/sanpham")
public class sanpham extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sanpham() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loaibo lbo = new loaibo();		
        request.setAttribute("dsloai", lbo.getloai());
        sanphambo sbo = new sanphambo();
         request.setCharacterEncoding("utf-8");
	     response.setCharacterEncoding("utf-8");
	     String indexPage=request.getParameter("index");
	     if(indexPage == null) {
	    	 indexPage = "1";
	     }
	     sanphamdao spdao = new sanphamdao();
	     int index = Integer.parseInt(indexPage);
	     List<sanphambean> danhsach = spdao.getlistsanpham(index);
	     
	     String ml=request.getParameter("ml");
	     String key=request.getParameter("txttk");
	     
			int demtrang = spdao.dem();
			int page = demtrang/9;
			System.out.print(page);
			if(demtrang % 9 != 0) {
				page++;
			}
	     if(ml!=null)
	    	 danhsach=sbo.TimMa(ml);
	     else
	    	 if(key!=null)
	    		 danhsach=sbo.Tim(key);
	    request.setAttribute("dem", page);
        request.setAttribute("dssanpham", danhsach);
        RequestDispatcher rd = request.getRequestDispatcher("sanpham.jsp");
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
