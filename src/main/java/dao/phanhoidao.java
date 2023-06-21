package dao;

import java.sql.PreparedStatement;
import java.util.List;

import bean.htphanhoibean;
import bean.phanhoibean;

public class phanhoidao {
	phanhoibean ph = new phanhoibean();
	public int Them(long makh, String noidung) throws Exception{
		KetNoi kn=new KetNoi();
		kn.KetNoi();
		//b1: tao cau lenh sql
		String sql="insert into phanhoi(makh, noidung) values (?,?)";
		 //B2: Tao ra cau lenh: Preparestatement de thuc thi cau lenh sql
   	    PreparedStatement cmd= kn.cn.prepareStatement(sql);
	   	  //theo thứ tự
   	    cmd.setLong(1, makh);
	   	cmd.setString(2, noidung);
	   	return cmd.executeUpdate();
	}
	public static void main(String[] args) throws Exception {
		phanhoidao phdao=new phanhoidao();
		htphanhoidao ht = new htphanhoidao();
		int kh= phdao.Them(2, "abc");
		List<htphanhoibean> danhsach = new htphanhoidao().getphanhoi();
		for(htphanhoibean o : danhsach) {
			System.out.println(o.getHoten());
			System.out.println(o.getTen_anh());
			System.out.println(o.getNoidung());
		}
	}
}
