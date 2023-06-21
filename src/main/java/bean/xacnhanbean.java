package bean;

import java.util.Date;

public class xacnhanbean {
    private long machitiethoadon;
    private String hoten;
    private String tensanpham;
    private Date ngaymua;
    private long soluongmua;
    private long ThanhTien;
    private boolean damua;
	public xacnhanbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public xacnhanbean(long machitiethoadon, String hoten, String tensanpham, Date ngaymua, long soluongmua,
			long thanhTien, boolean damua) {
		super();
		this.machitiethoadon = machitiethoadon;
		this.hoten = hoten;
		this.tensanpham = tensanpham;
		this.ngaymua = ngaymua;
		this.soluongmua = soluongmua;
		ThanhTien = thanhTien;
		this.damua = damua;
	}
	public long getMachitiethoadon() {
		return machitiethoadon;
	}
	public void setMachitiethoadon(long machitiethoadon) {
		this.machitiethoadon = machitiethoadon;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensach(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public Date getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	public long getSoluongmua() {
		return soluongmua;
	}
	public void setSoluongmua(long soluongmua) {
		this.soluongmua = soluongmua;
	}
	public long getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(long thanhTien) {
		ThanhTien = thanhTien;
	}
	public boolean isDamua() {
		return damua;
	}
	public void setDamua(boolean damua) {
		this.damua = damua;
	}
	
}

