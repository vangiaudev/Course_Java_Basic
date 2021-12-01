package vangiaurecca.example.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diem;
	public SinhVien(){
		
	}
	public SinhVien(int ma){
		this();
		this.ma = ma;
	}
	public SinhVien(int ma, String ten){
		this(ma);
		this.ten = ten;
	}
	public SinhVien(int ma, String ten, double diem){
		this(ma, ten);
		this.diem = diem;
	}
	
	//3 ham ben duoi la overloading method
	public void xetTotNghiep(){
		if(this.diem >= 5){
			System.out.println("Duoc xet tot nghiep");
		}
		else{
			System.out.println("Chua duoc xet");
		}
	}
	public void xetTotNghiep(double diem){
		System.out.println("Ban co diem " + diem );
	}
	public void xetTotNghiep(double diem, int vungUuTien){
		System.out.println("Ban co diem " + diem +" Vung uu tien: " + vungUuTien);
	}
	public void dangKyHocPhan(int maHP){
		
	}
	public void dangKyHocPhan(String maHP){
}
