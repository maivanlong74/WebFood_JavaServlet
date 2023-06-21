package bean;

public class sanphambean {
	private String masanpham;
	private String tensanpham;
	private int soluong;
	private int gia;
	private String maloai;
	private String anh;
	private String video;
	public sanphambean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sanphambean(String masanpham, String tensanpham, int soluong, int gia, String maloai, String anh,
			String video) {
		super();
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
		this.video = video;
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}
