package vangiaurecca.example.model;

public class NhanVienChinhThuc extends NhanVien {

	public void tinhLuong(int ngayCong) {
		if(ngayCong < 20)
			System.out.println("5 triêu");
		else
			System.out.println("20 triệu");
	}

}
