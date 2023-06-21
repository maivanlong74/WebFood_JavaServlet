package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.htkhachhangbean;
import bean.lichsubean;

public class htkhachhangdao {
public ArrayList<htkhachhangbean> getkh(long makh){
	    
        ArrayList<htkhachhangbean> list = new ArrayList<htkhachhangbean>();
        try {
        	KetNoi kn=new KetNoi();
		    kn.KetNoi();
            String query = "select *from khachhang where makh = ?";
            PreparedStatement pst = kn.cn.prepareStatement(query);
            pst.setLong(1, makh);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            	String hoten = rs.getString("hoten");
            	long sodt = rs.getLong("sodt");
            	String diachi = rs.getString("diachi");
            	long thenganhang = rs.getLong("thenganhang");
            	String tennganhang = rs.getString("tennganhang");
            	String ten_anh = rs.getString("ten_anh");
            	String tendn = rs.getString("tendn");
            	String pass = rs.getString("pass");
            	list.add(new htkhachhangbean(makh, hoten, sodt, diachi, thenganhang, tennganhang, ten_anh, tendn, pass));
            }
            rs.close();
			kn.cn.close();
			return list;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
        
    }
}
