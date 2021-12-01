package vangiaurecca.example.test;
import vangiaurecca.example.model.SinhVien;
public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien obama = new SinhVien();
		SinhVien teo = new SinhVien("Văn Tèo", 9.8);
		System.out.println("Điểm của Tèo: " + teo.getDiem());
		System.out.println("Tên của Tèo: " + teo.getHoTen() );
		obama.setHoTen("Nguyễn Văn Obama");
		System.out.println("Tên obama: " + obama.getHoTen());
		SinhVien giau = new SinhVien("Nguyễn Văn Giàu", 10);
		giau.xuatThongTin();
		
		System.out.println("--------");
		System.out.println(giau);
		
	}

}
