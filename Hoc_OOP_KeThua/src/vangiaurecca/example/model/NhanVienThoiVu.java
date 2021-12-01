package vangiaurecca.example.model;

public class NhanVienThoiVu extends NhanVien {
	public NhanVienThoiVu(){
		super();
	}
	public NhanVienThoiVu(int ma, String ten){
		super(ma, ten);
	}
	public void tinhLuong(){
		super.tinhLuong();
		System.out.println("Day la nhan vien thoi vu");
	}
}
