package vangiaurecca.example.test;

import vangiaurecca.example.model.NhanVienChinhThuc;
import vangiaurecca.example.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1, "Nguyen Van Teo");
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Tran Van Ty");
		teo.tinhLuong();
		ty.tinhLuong();
	}

}
