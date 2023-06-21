package bean;

public class dangkybean {
	private String hoten;
	private long sodt;
	private String diachi;
	private long thenganhang;
	private String tennganhang;
	private String ten_anh;
	private String tendn;
	private String pass;
	public dangkybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public dangkybean(String hoten, long sodt, String diachi, long thenganhang, String tennganhang, String ten_anh,
			String tendn, String pass) {
		super();
		this.hoten = hoten;
		this.sodt = sodt;
		this.diachi = diachi;
		this.thenganhang = thenganhang;
		this.tennganhang = tennganhang;
		this.ten_anh = ten_anh;
		this.tendn = tendn;
		this.pass = pass;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public long getSodt() {
		return sodt;
	}
	public void setSodt(long sodt) {
		this.sodt = sodt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public long getThenganhang() {
		return thenganhang;
	}
	public void setThenganhang(long thenganhang) {
		this.thenganhang = thenganhang;
	}
	public String getTennganhang() {
		return tennganhang;
	}
	public void setTennganhang(String tennganhang) {
		this.tennganhang = tennganhang;
	}
	public String getTen_anh() {
		return ten_anh;
	}
	public void setTen_anh(String ten_anh) {
		this.ten_anh = ten_anh;
	}
	public String getTendn() {
		return tendn;
	}
	public void setTendn(String tendn) {
		this.tendn = tendn;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
