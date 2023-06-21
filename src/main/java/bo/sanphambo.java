package bo;

import java.util.ArrayList;
import java.util.List;

import bean.sanphambean;
import dao.sanphamdao;

public class sanphambo {
	sanphamdao sdao = new sanphamdao();
	
	/*
	 * ArrayList<sanphambean> ds;
	 * 
	 * public ArrayList<sanphambean> getsanpham() { ds = sdao.getsanpham(); return
	 * ds; }
	 */
	 

	List<sanphambean> danhsach;

	public List<sanphambean> getlistsanpham(int index) {
		danhsach = sdao.getlistsanpham(index);
		return danhsach;
	}

	public List<sanphambean> TimMa(String maloai) {
		List<sanphambean> tam = new ArrayList<sanphambean>();
		for (sanphambean s : danhsach)
			if (s.getMaloai().equals(maloai))
				tam.add(s);
		return tam;
	}

	public List<sanphambean> Tim(String key) {
		List<sanphambean> tam = new ArrayList<sanphambean>();
		for (sanphambean s : danhsach)
			if (s.getTensanpham().toLowerCase().contains(key.toLowerCase())
					|| s.getMaloai().toLowerCase().contains(key.toLowerCase()))
				tam.add(s);
		return tam;
	}
}
