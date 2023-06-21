package bean;

public class phanhoibean {
	private long matinnhan;
	private long makhachhang;
	private String noidung;
	public phanhoibean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public phanhoibean(long matinnhan, long makhachhang, String noidung) {
		super();
		this.matinnhan = matinnhan;
		this.makhachhang = makhachhang;
		this.noidung = noidung;
	}
	public long getMatinnhan() {
		return matinnhan;
	}
	public void setMatinnhan(long matinnhan) {
		this.matinnhan = matinnhan;
	}
	public long getMakhachhang() {
		return makhachhang;
	}
	public void setMakhachhang(long makhachhang) {
		this.makhachhang = makhachhang;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	
}
