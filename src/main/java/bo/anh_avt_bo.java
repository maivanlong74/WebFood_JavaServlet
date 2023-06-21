package bo;

import dao.anh_avt_dao;

public class anh_avt_bo {
	anh_avt_dao avt = new anh_avt_dao();
	public int Them(String ten_anh) throws Exception{
		return avt.Them(ten_anh);
	}
	public String getAnh(int mA) throws Exception {
		return avt.getAnh(mA);
	}
}
