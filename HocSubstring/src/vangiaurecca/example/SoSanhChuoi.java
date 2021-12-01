package vangiaurecca.example;

public class SoSanhChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "an";
		String s2 = "AN";
		int kq = s1.compareTo(s2);
		System.out.println(kq); //nếu kq > 0 thì s1 > s2;
		
		int kq2 = s1.compareToIgnoreCase(s2);
		System.out.println(kq2);
		if(s1.equals(s2)){
			System.out.println("Bằng");
		}
		else{
			System.out.println("Không Bằng");
		}
		
		if(s1.equalsIgnoreCase(s2)){ //so sách ko phân biệt chữ hoa chữ thường
			System.out.println("Bằng");
		}
		else{
			System.out.println("Không Bằng");
		}

	}

}
