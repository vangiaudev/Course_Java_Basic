package vangiaurecca.example;

public class InHoaInThuong {
	public static void change(int n){
	    //khai báo 3 biến hour, minute, second đại diện cho giờ phút giây
	    int hour, minute, second;
	    //1h = 3600s -> hour = n / 3600
	    hour = n / 3600;
	    //1p = 60s, vì ở trên ta đã chia 3600 để lấy giờ
	    //vậy nên ta cần lấy phần dư của nó chia cho 60
	    minute = n % 3660 / 60;
	    //phần dư còn lại chính là số giây
	    second = n % 3600 % 60;
	    System.out.printf("Sau khi đổi từ %d giây: %d:%d:%d",n,hour,minute,second);
	  }

//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
//		String s = "VĂN GIÀU";
//		String s2 = "giàu recca";
//		String kq = s.toLowerCase();
//		String kq2 = s2.toUpperCase();
//		System.out.println(kq);
//		System.out.println(kq2);
//		
//		//in hoa kí tự đầu
//		s2 = s2.replaceFirst("g", "g".toUpperCase());
//		System.out.println(s2);
//		
//		s2 = "fullstack";
//		s2=s2.replaceFirst((s2.charAt(0) +""), (s2.charAt(0)+"").toUpperCase());
//		System.out.println(s2);
//		String lowerCaseItemName = "văn giàu";
//		String firstLetterCapital = lowerCaseItemName.substring(0, 1).toUpperCase() + lowerCaseItemName.substring(1);
//		System.out.println(firstLetterCapital);
//		
//		String message = "macbook air 13\" (2020) - 256GB - chính hãng";
//		char[] charArray = message.toCharArray();
//	    boolean foundSpace = true;
//	    //sử dụng vòng lặp for để duyệt các phần tử trong charArray
//	    for(int i = 0; i < charArray.length; i++) {
//	      // nếu phần tử trong mảng là một chữ cái
//	      if(Character.isLetter(charArray[i])) {
//	        // kiểm tra khoảng trắng có trước chữ cái
//	        if(foundSpace) {
//	          //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
//	          charArray[i] = Character.toUpperCase(charArray[i]);
//	          foundSpace = false;
//	        }
//	      }
//	      else {
//	        foundSpace = true;
//	      }
//	    }
//	    // chuyển đổi mảng char thành string
//	    message = String.valueOf(charArray);
//	    System.out.println("Chuỗi sau khi đổi: \n" + message);
//	    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
//	    change(6000);
//	    
//	    
//	    
//		
//
//	}
	
	 public static void main(String[] args) {
	        // ten chi co mot chu dem
	        String fullName = " ";
	        // xoa ki tu trang thua o truoc va sau neu co
	        String[] tmp = fullName.trim().split("\\s+");

	        System.out.println("Ho viet hoa: " + tmp[0].toUpperCase());
	        
	        System.out.println("Ten viet hoa: " + tmp[tmp.length - 1].toUpperCase());
	    }
}
