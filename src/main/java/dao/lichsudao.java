package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.lichsubean;

public class lichsudao {
	public ArrayList<lichsubean> getlichsu(long makh){
	    
        ArrayList<lichsubean> list = new ArrayList<lichsubean>();
        try {
        	KetNoi kn=new KetNoi();
		    kn.KetNoi();
            String query = "select DISTINCT * from lichsu where makh = ?";
            PreparedStatement pst = kn.cn.prepareStatement(query);
            pst.setLong(1, makh);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            	long mahoadon = rs.getLong("mahoadon");
            	String hoten = rs.getString("hoten");
            	Date ngaymua = rs.getDate("ngaymua");
            	long ThanhTien = rs.getLong("ThanhTien");
            	Boolean damua = rs.getBoolean("damua");
            	list.add(new lichsubean(makh, mahoadon, hoten,  ngaymua, ThanhTien, damua));
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
