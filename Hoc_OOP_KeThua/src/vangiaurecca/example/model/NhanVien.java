package vangiaurecca.example.model;

public class NhanVien {
	protected int ma;
	protected String ten;
	
	public NhanVien() {
		super();
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public void tinhLuong(){
		System.out.println("Nhan vien "+this.ten + " goi tinh luong");
	}
}
