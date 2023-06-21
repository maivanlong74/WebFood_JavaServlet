package bean;

public class htphanhoibean {
	private long matinnhan;
	private String ten_anh;
	private String hoten;
	private String noidung;
	public htphanhoibean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public htphanhoibean(long matinnhan, String ten_anh, String hoten, String noidung) {
		super();
		this.matinnhan = matinnhan;
		this.ten_anh = ten_anh;
		this.hoten = hoten;
		this.noidung = noidung;
	}
	public long getMatinnhan() {
		return matinnhan;
	}
	public void setMatinnhan(long matinnhan) {
		this.matinnhan = matinnhan;
	}
	public String getTen_anh() {
		return ten_anh;
	}
	public void setTen_anh(String ten_anh) {
		this.ten_anh = ten_anh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	
}
