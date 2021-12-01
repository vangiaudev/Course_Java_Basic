package vangiaurecca.example.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import vangiaurecca.example.io.SerializeFileFactory;
import vangiaurecca.example.model.Contact;

public class TestContact {
	static HashMap<Integer, Contact> csdl = new HashMap<Integer, Contact>();
	public static void menu(){
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm Kiếm");
		System.out.println("6.Sắp Xếp");
		System.out.println("7.Lưu File");
		System.out.println("8.Đọc File");
		System.out.println("9.Thoát");
		System.out.println("Thím chọn gì: ?");
		int n = new Scanner(System.in).nextInt();
		switch (n) {
		case 1:
			them();	
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			timkiem();
			break;
		case 6:
			sapxep();
			break;
		case 7:
			luuFile();
			break;
		case 8:
			docFile();
			break;
		case 9:
			System.err.println("Tạm biệt thím!");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void docFile() {
		// TODO Auto-generated method stub
		csdl = SerializeFileFactory.readFile("d://csdlcontact.dat");
	}
	private static void luuFile() {
		// TODO Auto-generated method stub
		SerializeFileFactory.saveFile(csdl, "D://csdlcontact.dat");
	}
	private static void sapxep() {
		// TODO Auto-generated method stub
		
	}
	private static void timkiem() {
		System.out.println("Nhập phone: ");
		String phone  = new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, Contact> item : csdl.entrySet())
		{
			if(item.getValue().getPhone().startsWith(phone))
			System.out.println(item.getValue());
		}
		
	}
	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã:");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)){
			csdl.remove(ma);
		}
		else{
			System.out.println("Không tìm thấy mã để xóa");
		}
	}
	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã muốn sửa");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)){
			System.out.println("Nhập tên:");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("Nhập Phone: ");
			String phone  = new Scanner(System.in).nextLine();
			
			Contact c = new Contact(ma, ten, phone);
			csdl.put(ma, c);
		}
		else{
			System.out.println("Mã không hợp lệ");
		}
	}
	private static void xuat() {
		System.out.println("Danh sách danh bạ");
		for(Map.Entry<Integer, Contact> item : csdl.entrySet())
		{
			System.out.println(item.getValue());
		}
		
	}
	private static void them() {
		System.out.println("Nhập mã:");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên:");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Nhập Phone: ");
		String phone  = new Scanner(System.in).nextLine();
		
		Contact c= new Contact(ma, ten, phone);
		if(csdl.containsKey(c.getId())== false){
			csdl.put(c.getId(), c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			menu();
		}
	}

}
