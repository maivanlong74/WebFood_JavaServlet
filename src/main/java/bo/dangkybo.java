package bo;

import dao.dangkydao;

public class dangkybo {
	dangkydao dk=new dangkydao();
	 public int Them(String hoten, long sodt, String diachi, long thenganhang, String tennganhang, String anhavt, String tendn, String pass) throws Exception{
	    return dk.Them(hoten, sodt, diachi, thenganhang, tennganhang, anhavt, tendn, pass);
	   }
}
