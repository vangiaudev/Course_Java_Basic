package vangiaurecca.example;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList ds = new ArrayList();
		ds.add("1");
		ds.add("113");
		System.out.println(ds.get(1));
		ArrayList<Double> ds2 = new ArrayList<Double>();
		ds2.add(2.3);
		ds2.add(3.4);
		System.out.println(ds2.get(0));
		
		ArrayList<String> ds3 = new ArrayList<String>();
		ds3.add("Van Giau");
		ds3.add("Van Teo");
		ds3.add("Van Ty");
		for(int i = 0; i<ds3.size(); i++){
			System.out.println(ds3.get(i));
		}
		ds3.add("Chu Ba Thong");
		System.out.println("Danh sach sau khi chen");
		for(int i = 0; i<ds3.size(); i++){
			System.out.println(ds3.get(i));
		}
		System.out.println("Danh sach sau khi xoa");
		ds3.remove("Van Ty");
		for(int i = 0; i<ds3.size(); i++){
			System.out.println(ds3.get(i));
		}
		System.out.println("Danh sach sau khi sua");
		ds3.set(0, "Nguyen Giau");
		for(int i = 0; i<ds3.size(); i++){
			System.out.println(ds3.get(i));
		}
		

	}

}
