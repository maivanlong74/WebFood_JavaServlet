package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.anh_avt_bean;
import bean.khachhangbean;
import bo.anh_avt_bo;
import bo.dangkybo;

/**
 * Servlet implementation class ktdk
 */
@WebServlet("/ktdk")
public class ktdk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String HOTENKH = null ;
		String SODIENTHOAI = null;
		String DIACHI = null;
		String THENH  = null;
		String TENNH = null;		
		String TENDANGNHAP = null;
		String MATKHAU = null;
		String GOLAIMK = null;
		String ten_anh = "";
		 DiskFileItemFactory factory = new DiskFileItemFactory();
		 DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		 ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		 String dirUrl1 = request.getServletContext().getRealPath("") +  File.separator + "avt";
		 response.getWriter().println(dirUrl1);
		try { List<FileItem> fileItems = upload.parseRequest(request);//Lấy về các đối tượng gửi lên
			  for (FileItem fileItem : fileItems) {
			     if (!fileItem.isFormField()) {//Nếu ko phải các control=>upfile lên
					// xử lý file
					String nameimg = fileItem.getName();
					if (!nameimg.equals("")) {
						String dirUrl = request.getServletContext().getRealPath("") +  File.separator + "avt";
						File dir = new File(dirUrl);
						if (!dir.exists()) {//nếu ko có thư mục thì tạo ra
							dir.mkdir();
						}
					           String fileImg = dirUrl + File.separator + nameimg;
					           File file = new File(fileImg);//tạo file
					            try {
					               fileItem.write(file);//lưu file       
					              System.out.println("UPLOAD THÀNH CÔNG...!");
					              System.out.println("Đường dẫn lưu file là: "+dirUrl);
					 } catch (Exception e) {
					    e.printStackTrace();
					}
			}
			HttpSession session=request.getSession();
			ten_anh = "\\Web_food\\avt\\" + nameimg ;
			anh_avt_bo avt_bo = new anh_avt_bo();
			avt_bo.Them(ten_anh);
			System.out.println("-----------------------------------------------");
		 }
			else//Neu la control
				{
						System.out.println(fileItem.getFieldName());
						String tentk=fileItem.getFieldName();
						if(tentk.equals("HOTENKH"))
							HOTENKH = fileItem.getString();
						if(tentk.equals("SODIENTHOAI"))
							SODIENTHOAI = fileItem.getString();
						if(tentk.equals("DIACHI"))
							DIACHI = fileItem.getString();
						if(tentk.equals("THENH"))
							THENH = fileItem.getString();
						if(tentk.equals("TENNH"))
							TENNH = fileItem.getString();
						if(tentk.equals("TENDANGNHAP"))
							TENDANGNHAP = fileItem.getString();
						if(tentk.equals("MATKHAU"))
							MATKHAU = fileItem.getString();
						if(tentk.equals("GOLAIMK"))
							GOLAIMK = fileItem.getString();
		
					}
			}
			  //lưu thông tin lại
			  
			  if(MATKHAU.equals(GOLAIMK)) {
					dangkybo tk=new dangkybo();		
					tk.Them(HOTENKH, Long.parseLong(SODIENTHOAI), DIACHI, Long.parseLong(THENH), TENNH, ten_anh, TENDANGNHAP, MATKHAU);
					System.out.print(ten_anh);
					response.sendRedirect("trangchu");
					}else
					{
						RequestDispatcher rd = request.getRequestDispatcher("dangky");
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
