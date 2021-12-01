package vangiaurecca.example.model;

public class QuanLyNhanVien {
	private String ho;
	private String ten;
	private int soSP;
	public QuanLyNhanVien(String ho, String ten, int soSP) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.soSP = soSP;
		if(soSP < 0){
			this.soSP = 0;
		}
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public double getLuong(){
		double donGia = 0;
		if(this.soSP <= 199){
			donGia = 0.5;
		}
		else if(this.soSP  <= 399){
			donGia= 0.55;
		}
		else if(this.soSP <= 599){
			donGia = 0.6;
		}
		else{
			donGia = 0.65;
		}
		return this.soSP * donGia;
	}
	public boolean lonHon(QuanLyNhanVien nv2){
		return this.soSP > nv2.soSP;
	}
	
	
}
