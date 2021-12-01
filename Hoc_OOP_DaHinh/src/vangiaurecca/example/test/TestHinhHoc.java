package vangiaurecca.example.test;

import vangiaurecca.example.model.HinhChuNhat;
import vangiaurecca.example.model.HinhHoc;
import vangiaurecca.example.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h = new HinhChuNhat(4, 5);
		System.out.println("Chu vi = " + h.tinhChuVi());
		System.out.println("Dien tich = " + h.tinhDienTich());
		System.out.println("--------------");
		h = new HinhVuong(5);
		System.out.println("Chu vi = " + h.tinhChuVi());
		System.out.println("Dien tich = " + h.tinhDienTich());
		HinhChuNhat hcn = new HinhVuong(5);
		System.out.println("--------------");
		System.out.println("Chu vi = " + hcn.tinhChuVi());
		System.out.println("Dien tich = " + hcn.tinhDienTich());
	}

}
