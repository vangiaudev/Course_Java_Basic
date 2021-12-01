package vangiaurecca.example.test;

import vangiaurecca.example.model.IDoable;
import vangiaurecca.example.model.NhanVien;
import vangiaurecca.example.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoable x;
		x = new NhanVien();
		x.doSomething();
		x = new SinhVien();
		x.doSomething();
		
	}

}
