package bo;

import dao.chitiethoadondao;


public class chitiethoadonbo {
	chitiethoadondao ctdao=new chitiethoadondao();
	public int Them(String masanpham,long soluongmua,long mahoadon, boolean damua){
		return ctdao.Them(masanpham, soluongmua, mahoadon, damua);
	}
}
