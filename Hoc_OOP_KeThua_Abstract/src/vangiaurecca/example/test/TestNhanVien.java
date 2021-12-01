package vangiaurecca.example.test;

import vangiaurecca.example.model.NhanVienChinhThuc;
import vangiaurecca.example.model.NhanVienThoiVu;
public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc giau = new NhanVienChinhThuc(1, "Giau Developer");
		giau.tinhLuong();
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Ho Van Do");
		ty.tinhLuong();
		
	}

}
