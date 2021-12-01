package vangiaurecca.example.model;

public class SanPham implements Comparable<SanPham> {
	private int ma;
	private String ten;
	private double gia;
	public SanPham() {
		super();
	}
	public SanPham(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
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
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String toString(){
		return this.ma + "\t" + this.ten + "\t" + this.gia;
	}
	public int compareTo(SanPham x) {
//		if(this.gia < x.gia){
//			return 1;
//		}
//		if(this.gia > x.gia){
//			return -1;
//		}
//		return 0;
		return this.ten.compareToIgnoreCase(x.ten); //SX theo tên
	}
}
