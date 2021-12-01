package vangiaurecca.example.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diemTB;
	private XepLoai loai;
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
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public XepLoai getLoai() {
		if(this.diemTB >= 8){
			loai=XepLoai.Gioi;
		}
		else if(this.diemTB >= 6.5){
			loai=XepLoai.Kha;
		}
		else if(this.diemTB >= 5){
			loai=XepLoai.TrungBinh;
		}
		else{
			loai=XepLoai.Yeu;
		}
		return loai;
	}
	public SinhVien(int ma, String ten, double diemTB) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diemTB = diemTB;
		this.loai = getLoai();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	this.ma + "\t" + 
				this.ten + "\t" + 
				this.diemTB + "\t" + 
				this.loai.deScription();
	}
	
}
