package vangiaurecca.example;

public class XoaKhoangTrangDuThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   Nguyễn Văn Giàu   ";
		System.out.println("Chiều dài:" + s.length());
		s = s.trim(); //Xóa khoảng trắng bên trái và bên phải
		System.out.println(s);
		System.out.println("Chiều dài:" + s.length());
		s = "   Văn Tèo ăn cơm trưa với Văn Tý   ";
		int vtLeft = 0;
		int i = 0;
		for(i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == ' '){
				vtLeft = i;
			}
			else{
				break;
			}
			
		}
		s=s.substring(i);
		System.out.println(s); //Xóa khoảng trắng dư thùa bên trái

	}

}
