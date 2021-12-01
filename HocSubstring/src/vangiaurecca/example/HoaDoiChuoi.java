package vangiaurecca.example;

public class HoaDoiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Văn Giàu xin chào Obama! Đây là Văn Giàu";
		String output = s.replace("Văn Giàu", "Văn Tèo");
		System.out.println(output);
		String output2 = s.replaceFirst("Văn Giàu", "Văn Tý");
		System.out.println(output2);

	}

}
