package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.sanphambean;
import controller.sanpham;

public class sanphamdao {
	public ArrayList<sanphambean> getsanpham(){
		ArrayList<sanphambean> ds = new ArrayList<sanphambean>();
		try {
			//kết nối vào csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//Lấy dữ liệu về
			String sql = "select * from sanpham";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//lưu ALL dữ liệu vào mạng ds
			while (rs.next()) {
				String masanpham = rs.getString("masanpham");
				String tensanpham = rs.getString("tensanpham");
				int soluong = rs.getInt("soluong");
				int gia = rs.getInt("gia");
				String maloai = rs.getString("maloai");
				String anh = rs.getString("anh");
				String video = rs.getString("video");
				ds.add(new sanphambean(masanpham,tensanpham,soluong,gia,maloai,anh,video));
			}
			//đóng kết nối
			rs.close();
			kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public int dem() {
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//Lấy dữ liệu về
			String sql = "select count(*) from sanpham";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	public List<sanphambean> getlistsanpham(int index){
		List<sanphambean> danhsach = new ArrayList<>();
		try {
			//kết nối vào csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//Lấy dữ liệu về
			String sql = "select *from sanpham\r\n"
						+ "order by masanpham\r\n"
						+ "offset ? rows fetch next 9 rows only;";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setInt(1, (index-1)*9);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String masanpham = rs.getString("masanpham");
				String tensanpham = rs.getString("tensanpham");
				int soluong = rs.getInt("soluong");
				int gia = rs.getInt("gia");
				String maloai = rs.getString("maloai");
				String anh = rs.getString("anh");
				String video = rs.getString("video");
				danhsach.add(new sanphambean(masanpham,tensanpham,soluong,gia,maloai,anh,video));
			}
			//đóng kết nối
			rs.close();
			kn.cn.close();
			return danhsach;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		sanphamdao spdao=new  sanphamdao();
		List<sanphambean> danhsach = new sanphamdao().getlistsanpham(1);
		for(sanphambean o : danhsach) {
			System.out.println(o);
		}
	}
}
