package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.xacnhanbean;

public class xacnhandao {
    public ArrayList<xacnhanbean> getdanhsach(){
    	ArrayList<xacnhanbean> ds= new ArrayList<xacnhanbean>();
    	try {	
			KetNoi kn= new KetNoi();
			kn.KetNoi();
    		String sql="select * from xacnhan where damua = 0";
    		PreparedStatement cmd=kn.cn.prepareStatement(sql);
    		ResultSet rs= cmd.executeQuery();
    		//B3: Duyet rs de luu vao ds
    		while(rs.next()) {
    			  long machitiethoadon=rs.getLong("machitiethoadon");
    			   String hoten=rs.getString("hoten");
    			   String tensanpham=rs.getString("tensanpham");;
    			    Date ngaymua=rs.getDate("ngaymua");
    			    long soluongmua=rs.getLong("soluongmua");;
    			    long ThanhTien=rs.getLong("ThanhTien");;
    			    boolean damua=rs.getBoolean("damua");
    			    ds.add(new xacnhanbean(machitiethoadon, hoten, tensanpham, ngaymua, soluongmua, ThanhTien, damua));
    		}
    		//b4: Dong cac doi tuong
    		rs.close();kn.cn.close();
    		return ds;
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
 }
    
    public void trangthai(long machitiethoadon){
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
    		String sql = "update xacnhan set [damua] = 1 where machitiethoadon = ?";
			PreparedStatement cmd=kn.cn.prepareStatement(sql);
    		cmd.setLong(1, machitiethoadon);
    		cmd.execute();
    		//B3: Duyet rs de luu vao ds
    		   	
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			
		}
    }
    
    public static void main(String[] args) {
		xacnhandao xndao=new  xacnhandao();
		xndao.trangthai(38);
//		khachhangbean kh=khdao.getkhachhang("nkchung", "123");
		System.out.println(xndao.getdanhsach());
	}
}
