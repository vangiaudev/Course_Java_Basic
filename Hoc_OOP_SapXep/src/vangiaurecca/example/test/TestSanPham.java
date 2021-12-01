package vangiaurecca.example.test;

import java.util.ArrayList;
import java.util.Collections;

import vangiaurecca.example.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham> ds = new ArrayList<SanPham>();
		ds.add(new SanPham(1, "Voca", 10));
		ds.add(new SanPham(2, "Pepsi", 11));
		ds.add(new SanPham(3, "Sting" , 9));
		System.out.println("Danh sách sản phẩm");
		for(SanPham sp : ds){
			System.out.println(sp);
		}
		Collections.sort(ds);
		System.out.println("Danh sách sản phẩm sau khi Sort: ");
		for(SanPham sp : ds){
			System.out.println(sp);
		}
	}

}
