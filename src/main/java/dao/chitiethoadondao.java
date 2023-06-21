package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class chitiethoadondao {
	public int Them(String masanpham,long soluongmua,long mahoadon, boolean damua) {
		try {
			KetNoi kn=new KetNoi();
			kn.KetNoi();
			String sql="insert into chitiethoadon(masanpham ,soluongmua, mahoadon, damua) values(?,?,?,?)";
			PreparedStatement cmd=kn.cn.prepareStatement(sql);
			cmd.setString(1, masanpham);
			cmd.setLong(2, soluongmua);
			cmd.setLong(3, mahoadon);
			cmd.setBoolean(4, damua);
			int kq=cmd.executeUpdate();
			kn.cn.close();
			return kq;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
}
