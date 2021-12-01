package vangiaurecca.example.test;

import vangiaurecca.example.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien teo = new SinhVien(1, "Nguyen Van Teo", 3);
		teo.xetTotNghiep();
		teo.xetTotNghiep(5);
		teo.xetTotNghiep(9, 1);
	}

}
