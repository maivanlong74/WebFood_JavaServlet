package bean;

import java.sql.Date;

public class lichsubean {
	private long makh;
	private long MaHoaDon;
	private String hoten;
	private Date ngaymua;
	private long ThanhTien;
	private boolean damua;
	public lichsubean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsubean(long makh, long maHoaDon, String hoten,  Date ngaymua,
			long ThanhTien, boolean damua) {
		super();
		this.makh = makh;
		this.hoten = hoten;
		MaHoaDon = maHoaDon;
		this.ngaymua = ngaymua;
		this.ThanhTien = ThanhTien;
		this.damua = damua;
	}
	public long getMakh() {
		return makh;
	}
	public void setMakh(long makh) {
		this.makh = makh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public long getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(long maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public Date getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	public long getThanhtien() {
		return ThanhTien;
	}
	public void setThanhtoan(long thanhtoan) {
		this.ThanhTien = ThanhTien;
	}
	public boolean isDamua() {
		return damua;
	}
	public void setDamua(boolean damua) {
		this.damua = damua;
	}
	
}
