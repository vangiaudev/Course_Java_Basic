package vangiaurecca.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BTRL_ArrayList {
	static ArrayList<Integer> dsData = new ArrayList<Integer>();
	public static void Menu(){
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm kiếm");
		System.out.println("6.Sắp xếp");
		System.out.println("7.Thoát");
		System.out.println("Thím chọn gì:");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			Them();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			Sua();
			break;
		case 4:
			Xoa();
			break;
		case 5:
			TimKiem();
			break;
		case 6:
			SapXep();
			break;
		case 7:
			System.err.println("Cám ơn thím");
			break;
		default:
			break;
		}
	}
	private static void SapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsData);
		
	}
	private static void TimKiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số cần tìm");
		int k = new Scanner(System.in).nextInt();
		if(dsData.contains(k)){
			System.out.println("Có " + k + " trong danh sách");
		}
		else{
			System.out.println("Không Có " + k + " trong danh sách");
		}
	}
	private static void Xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhập vị trí cần xóa");
		int vt = new Scanner(System.in).nextInt();
		dsData.remove(vt);
	}
	private static void Sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhập vị trí cần sửa");
		int vt = new Scanner(System.in).nextInt();
		System.out.println("Nhập giá trị mới:");
		int value = new Scanner(System.in).nextInt();
		dsData.set(vt, value);
	}
	public static void Them(){
		System.out.println("Nhập giá trị thêm:");
		int value = new Scanner(System.in).nextInt();
		dsData.add(value);
	}
	public static void Xuat(){
		for(int i = 0; i<dsData.size(); i++){
			System.out.println(dsData.get(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			Menu();
			
		}
	}

}
