package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.anh_avt_bean;
import bean.sanphambean;

public class anh_avt_dao {
	anh_avt_bean avt = new anh_avt_bean();
	public int Them(String ten_anh) throws Exception{
		KetNoi kn=new KetNoi();
		kn.KetNoi();
		//b1: tao cau lenh sql
		String sql="insert into fileanh(ten_anh) values (?)";
		 //B2: Tao ra cau lenh: Preparestatement de thuc thi cau lenh sql
   	    PreparedStatement cmd= kn.cn.prepareStatement(sql);
	   	  //theo thứ tự
   	    cmd.setString(1, ten_anh);
	   	return cmd.executeUpdate();
	}
	public String getAnh(int mA) throws Exception{
		KetNoi kn=new KetNoi();
		kn.KetNoi();
		//b1: tao cau lenh sql
		String sql="select * from filean where ma_anh =?";
		 //B2: Tao ra cau lenh: Preparestatement de thuc thi cau lenh sql
   	    PreparedStatement cmd= kn.cn.prepareStatement(sql);
   	    cmd.setInt(1, mA);
   	 ResultSet rs = cmd.executeQuery();
		//lưu ALL dữ liệu vào mạng ds
		while (rs.next()) {
			String ten_anh = rs.getString("ten_anh");
			return ten_anh;
		}
		//đóng kết nối
		rs.close();
		cmd.close();
	   	return "";
	}
}
