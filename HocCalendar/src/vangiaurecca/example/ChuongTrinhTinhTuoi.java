package vangiaurecca.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ChuongTrinhTinhTuoi {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		
		System.out.println("Mời thím nhập năm sinh");
		String namSinh = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try 
		{
			Date birth = sdf.parse(namSinh);
			//đổi ngày tháng năm
			cal.setTime(birth);
			int yearNS = cal.get(Calendar.YEAR);
			int tuoi = yearNow - yearNS;
			System.out.println("Bạn " + tuoi + " tuổi");
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}

}
