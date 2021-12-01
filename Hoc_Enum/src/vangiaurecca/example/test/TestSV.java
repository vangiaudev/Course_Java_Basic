package vangiaurecca.example.test;

import java.util.ArrayList;

import vangiaurecca.example.model.SinhVien;

public class TestSV {
	public static void main(String[] args) {
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1, "Teo", 6));
		dsSV.add(new SinhVien(2, "Ty", 9));
		dsSV.add(new SinhVien(1, "Bin", 2));
		dsSV.add(new SinhVien(1, "Bo", 7));
		System.out.println("Danh sach SV:");
		for(SinhVien sv : dsSV){
			System.out.println(sv);
		}
	}
}
