package vangiaurecca.example.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	public void setHoTen(String hoTen){
		this.hoTen = hoTen;
	}
	public void setDiem(double diem){
		this.diem = diem;
	}
	public String getHoTen(){
		return this.hoTen;
	}
	public double getDiem(){
		return this.diem;
	}
	public SinhVien(String hoTen, double diem){
		this.diem = diem;
		this.hoTen = hoTen;
		System.out.println("Đây là constructor có đối sô");
	}
	public SinhVien(){
		System.out.println("Đây là contructor mặc định");
	}
	public void xuatThongTin(){
		System.out.println(this.hoTen + "/" + this.diem);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Họ tên:" + this.hoTen + " /Điểm: " +this.diem;
	}
}
