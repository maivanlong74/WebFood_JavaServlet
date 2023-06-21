package bean;

public class anh_avt_bean {
	private long ma_anh;
	private String ten_anh;
	public anh_avt_bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public anh_avt_bean(long ma_anh, String ten_anh) {
		super();
		this.ma_anh = ma_anh;
		this.ten_anh = ten_anh;
	}
	public long getMa_anh() {
		return ma_anh;
	}
	public void setMa_anh(long ma_anh) {
		this.ma_anh = ma_anh;
	}
	public String getTen_anh() {
		return ten_anh;
	}
	public void setTen_anh(String ten_anh) {
		this.ten_anh = ten_anh;
	}
	
}
