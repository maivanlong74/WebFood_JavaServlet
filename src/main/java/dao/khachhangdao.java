package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.khachhangbean;

public class khachhangdao {
	public khachhangbean getkhachhang(String tendn, String pass){
		try {
			//kết nối vào csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//Lấy dữ liệu về
			String sql = "select * from khachhang where tendn = ? and pass = ?";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, tendn);
            cmd.setString(2, pass);
            khachhangbean kh=null;
			ResultSet rs = cmd.executeQuery();
			//lưu ALL dữ liệu vào mạng ds
			while (rs.next()) {
				long makh = rs.getLong("makh");
				String hoten = rs.getString("hoten");
				long sodt = rs.getLong("sodt");
				String diachi = rs.getString("diachi");
				long thenganhang = rs.getLong("thenganhang");
				String tennganhang = rs.getString("tennganhang");
				String ten_anh = rs.getString("ten_anh");

				kh= new khachhangbean(makh, hoten, sodt, diachi, thenganhang, tennganhang, ten_anh, tendn, pass);
			}
			//đóng kết nối
			rs.close();
			kn.cn.close();
			return kh;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		khachhangdao khdao=new  khachhangdao();
//		khachhangbean kh=khdao.getkhachhang("nkchung", "123");
		System.out.println(khdao.getkhachhang("long", "123").getMakh());
	}
}
