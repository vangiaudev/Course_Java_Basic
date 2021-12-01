package vangiaurecca.example;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TestNgayThangNam {

	public static void main(String[] args) {
		//lấy ngày giờ hiện tại của hệ thống
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1);
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		Date t = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(t));
		
		//Định dạng 24h => HH
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf2.format(t));
		
		//Định dạng 12h => hh aaa
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss aaa");
		System.out.println(sdf3.format(t));
		
		
		System.err.println("----------------------------");
		LocalDateTime startDate = LocalDateTime.of(2017, 11, 1, 4, 20, 39);
	    LocalDateTime endDate = LocalDateTime.of(2017, 11, 5, 5, 20, 39);
	         
	    // tính sự chênh lệch về giờ, phút, giây
	    // giữa 2 ngày startDate và endDate
	    // sử dụng phương thức between() của Duration
	    // Duration được dùng để tính sự chênh lệch về giây giữa 2 ngày
	    // bằng hàm getSeconds()
	    long differentInSeconds = Duration.between(startDate, endDate).getSeconds();
	         
	    // chuyển giây về giờ sử dụng hàm toHours()
	    long differentInHours = Duration.between(startDate, endDate).toHours();
	         
	    // chuyển giây về phút sử dụng hàm toMinutes()
	    long differentInMinutes = Duration.between(startDate, endDate).toMinutes();
	         
	    System.out.println("Sự chênh lệch giữa startDate và endDate là " + 
	        differentInSeconds + " giây tương ứng với " + differentInMinutes +
	        " phút và tương ứng với " + differentInHours + " giờ.");

	}

}
