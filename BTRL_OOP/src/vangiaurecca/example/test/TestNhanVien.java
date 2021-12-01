package vangiaurecca.example.test;

import java.util.Scanner;

import vangiaurecca.example.model.QuanLyNhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Mời bạn nhập thông tin của nhân viên 1: ");
		System.out.println("Nhập họ:");
		String ho1 = new Scanner(System.in).nextLine();
		System.out.println("Nhập tên:");
		String ten1 = new Scanner(System.in).nextLine();
		System.out.println("Số sản phẩm: ");
		int soSP = new Scanner(System.in).nextInt();
		QuanLyNhanVien nv1 = new QuanLyNhanVien(ho1, ten1, soSP);
		
		
		System.out.println("Mời bạn nhập thông tin của nhân viên 1: ");
		System.out.println("Nhập họ:");
		String ho2 = new Scanner(System.in).nextLine();
		System.out.println("Nhập tên:");
		String ten2 = new Scanner(System.in).nextLine();
		System.out.println("Số sản phẩm: ");
		int soSP2 = new Scanner(System.in).nextInt();
		QuanLyNhanVien nv2 = new QuanLyNhanVien(ho2, ten2, soSP2);
		
		System.out.println("Lương của nhân viên 1: " + nv1.getLuong());
		System.out.println("Lương của nhân viên 2: " +nv2.getLuong());
		
		if(nv1.lonHon(nv2)){
			System.out.println("Nhân Viên " + nv1.getHo() + " " +nv1.getTen() + " có nhiều sản phẩm hơn");
			System.out.println("Cụ thê là: " + (nv1.getSoSP() - nv2.getSoSP()) +" sản phẩm");
		}
		else
		{
			System.out.println("Nhân Viên " + nv2.getHo() + " " +nv2.getTen() + " có nhiều sản phẩm hơn");
			System.out.println("Cụ thê là: " + (nv2.getSoSP() - nv1.getSoSP()) +" sản phẩm");
		}
	}

}
