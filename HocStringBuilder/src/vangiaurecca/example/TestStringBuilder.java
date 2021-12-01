package vangiaurecca.example;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hé lô"); 
		sb.append(" ");
		sb.append("Ô ba má"); //nối
		sb.insert(3, "OK "); //chèn
		sb.delete(9, 11); //xóa từ vị trí thứ 9 đến vị trí thứ 10
		String str = sb.toString();
		System.out.println(str);

	}

}
