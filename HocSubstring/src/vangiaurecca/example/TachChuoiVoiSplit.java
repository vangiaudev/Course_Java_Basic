package vangiaurecca.example;

public class TachChuoiVoiSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nguyễn Văn Giàu;CNTT.D;Đại học SƯ PHẠM";
		String []arr = s.split(";");
		if(arr.length == 3){
			System.out.println("Tên: " + arr[0]);
			System.out.println("Lớp: " + arr[1]);
			System.out.println("Trường: " + arr[2]);
		}
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("-----------");
		for(String x : arr){
			System.out.println(x);
		}
		//nếu như muốn tách chuỗi có dấu chấm hoặc kí tự đặt biệt thì nên dùng 2 kí tự \\
		s="Nguyễn Văn Giàu.CNTT.D.Đại học SƯ PHẠM";
		String []arrStr = s.split("\\.");
		if(arr.length == 3){
			System.out.println("Tên: " + arrStr[0]);
			System.out.println("Lớp: " + arrStr[1]);
			System.out.println("Trường: " + arrStr[2]);
		}
	}

}
