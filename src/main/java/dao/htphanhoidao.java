package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.htphanhoibean;
import bean.sanphambean;

public class htphanhoidao {
	public ArrayList<htphanhoibean> getphanhoi(){
		ArrayList<htphanhoibean> ph = new ArrayList<htphanhoibean>();
		try {
			KetNoi kn=new KetNoi();
		    kn.KetNoi();
            String query = "select * from htphanhoi";
            PreparedStatement pst = kn.cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            	long matinnhan = rs.getLong("matinnhan");
            	String ten_anh = rs.getString("ten_anh");
            	String hoten = rs.getString("hoten");
            	String noidung = rs.getString("noidung");
            	ph.add(new htphanhoibean(matinnhan, ten_anh, hoten, noidung));
            }
            rs.close();
			kn.cn.close();
			return ph;
		} catch (Exception e) {
			e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
		}
	}
	public static void main(String[] args) {
		htphanhoidao spdao=new  htphanhoidao();
		List<htphanhoibean> danhsach = new htphanhoidao().getphanhoi();
		for(htphanhoibean o : danhsach) {
			System.out.println(o.getHoten());
			System.out.println(o.getTen_anh());
			System.out.println(o.getNoidung());
		}
	}
}
