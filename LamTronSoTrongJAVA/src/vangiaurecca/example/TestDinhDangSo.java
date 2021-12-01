package vangiaurecca.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập điểm toán:");
		double toan = sc.nextDouble();
		System.out.println("Mời bạn nhập điểm lý:");
		double ly = sc.nextDouble();
		System.out.println("Mời bạn nhập điểm hóa:");
		double hoa = sc.nextDouble();
		System.out.println("ĐIỂM TB: " + (toan+ly+hoa)/3);
		
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("ĐTB: " + df.format((toan+ly+hoa)/3));
	}

}
