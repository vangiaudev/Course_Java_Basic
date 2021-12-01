package vangiaurecca.example.model;

public class HinhChuNhat extends HinhHoc {
	
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int dai, int rong) {
		super(dai, rong);
		// TODO Auto-generated constructor stub
	}

	public double tinhChuVi() {
		return (this.getDai() + this.getRong()) * 2;
	}

	public double tinhDienTich() {
		return this.getDai() * this.getRong();
	}

}
