package bo;

import dao.phanhoidao;

public class phanhoibo {
	phanhoidao phdao = new phanhoidao();
	public int Them(long makh, String noidung) throws Exception{
		return phdao.Them(makh, noidung);
	}
}
