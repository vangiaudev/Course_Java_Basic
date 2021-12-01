package vangiaurecca.example.test;

import vangiaurecca.example.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham(1, "Coca", 2500);
		SanPham sp2 = new SanPham(2, "Sting", 3500);
		SanPham sp3 = new SanPham(3, "Seven Up", 4000);
		double t = SanPham.tongTien(sp1, sp2, sp3);
		System.out.println(t);
		double t2 = SanPham.tongTien(sp1, sp2);
		System.out.println(t2);

	}

}
