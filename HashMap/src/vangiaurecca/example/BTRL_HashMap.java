package vangiaurecca.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BTRL_HashMap {
	static HashMap<Integer, String> map = new HashMap<Integer, String>();
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
		
	}
	private static void TimKiem() {
		System.out.println("Nhập tên cần tìm");
		String ten = new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> i : map.entrySet()){
			System.out.println(i.getKey() + " " + i.getValue());
		}
		
	}
	private static void Xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã cần xóa");
		int ma = new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false){
			System.out.println("Ma " + ma + "Không Tồn Tại");
		}
		else{
			map.remove(ma);
		}
	}
	private static void Sua() {
		System.out.println("Nhập mã cần sửa");
		int ma = new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false){
			System.out.println("Ma " + ma + "Không Tồn Tại");
		}
		else{
			System.out.println("Nhập tên sách mới:");
			String ten = new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
	}
	@SuppressWarnings("resource")
	public static void Them(){
		System.out.println("Nhập mã sách:");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách:");
		String ten = new Scanner(System.in).nextLine();
		if(map.containsKey(ma)==false){
			map.put(ma, ten);
		}
		
	}
	public static void Xuat(){
		System.out.println("Mã/Tên sách:");
		for(Map.Entry<Integer, String> item : map.entrySet()){
			System.out.println(item.getKey() + " " + item.getValue());
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
