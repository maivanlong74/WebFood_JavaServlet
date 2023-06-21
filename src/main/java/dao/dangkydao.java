package dao;

import java.sql.PreparedStatement;

import bean.dangkybean;

public class dangkydao {
	dangkybean dk=new dangkybean();
	public int Them(String hoten, long sodt, String diachi, long thenganhang, String tennganhang, String anhavt, String tendn, String pass) throws Exception{
		KetNoi kn=new KetNoi();
		kn.KetNoi();
		//b1: tao cau lenh sql
		String sql="insert into khachhang(hoten, sodt, diachi, thenganhang, tennganhang, ten_anh, tendn, pass) values (?,?,?,?,?,?,?,?)";
		
		 //B2: Tao ra cau lenh: Preparestatement de thuc thi cau lenh sql
	   	  PreparedStatement cmd= kn.cn.prepareStatement(sql);
	   	  //theo thứ tự
		  cmd.setString(1, hoten);
		  cmd.setLong(2, sodt);
		  cmd.setString(3, diachi);
		  cmd.setLong(4, thenganhang);
		  cmd.setString(5, tennganhang);
		  cmd.setString(6, anhavt);
		  cmd.setString(7, tendn);
		  cmd.setString(8, pass);
	   	  return cmd.executeUpdate();
	}
}
