package vangiaurecca.example.model;

public class NhanVienChinhThuc extends NhanVien {
	public void tinhLuong(){
		super.tinhLuong();
		System.out.println("Day la nhan vien chinh thuc");
	}
	public NhanVienChinhThuc(){
		super();
	}
	public NhanVienChinhThuc(int ma, String ten){
		super(ma, ten);
	}
}
