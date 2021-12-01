package vangiaurecca.example.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	public SanPham(int ma, String ten, double gia){
		this.ma = ma;
		this.ten=ten;
		this.gia = gia;
	}
	public SanPham(){
		
	}
	public void setMa(int ma){
		this.ma = ma;
	}
	public int getMa(){
		return this.ma;
	}
	public void setTen(String ten){
		this.ten = ten;
	}
	public String getTen(){
		return this.ten;
	}
	public void setGia(int gia){
		this.gia = gia;
	}
	public double getGia(){
		return this.gia;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "/" +this.ten + "/" + this.gia;
	}
	public static double tongTien(SanPham ...sp){
		double tien = 0;
		for(SanPham s : sp){
			tien+=s.gia;
		}
		return tien;
	}

}

