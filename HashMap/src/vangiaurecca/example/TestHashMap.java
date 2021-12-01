package vangiaurecca.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(13, "Zack Steffen");
		hm.put(2, "Kyle Walker");
		hm.put(21, "Ferran Torres");
		hm.put(9, "Gabriel Jesus");
		
		
		//Lấy toàn bộ tên
		Collection<String> dsTen = hm.values();
		for(String ten : dsTen){
			System.out.println(ten);
		}
		Set<Integer> dsMa = hm.keySet();
		for(int ma : dsMa){
			System.out.println(ma);
		}
		System.out.println(hm.get(9));
		if(hm.containsKey(9) == false){
			hm.put(9, "Negredo");
		}
		else{
			System.out.println("Da ton tai");
		}
			
		System.out.println(hm.get(9));
		hm.clear();
		System.out.println(hm.size());
	}

}
