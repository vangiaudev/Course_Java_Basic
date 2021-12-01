package vangiaurecca.example;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Chào Bạn Nguyễn Văn Giàu");
		System.out.println(Integer.MAX_VALUE);


		Scanner sc = new Scanner(System.in);
//		System.out.println("Mời bạn nhập số nguyên:");
//		int a = sc.nextInt();
//		System.out.println(a);
//		System.out.println("Mời bạn nhập số thực:");
//		double b = sc.nextDouble();
//		System.out.println(b);
//		System.out.println("Mời bạn nhập chuỗi:");
//		String str = sc.nextLine();
//		System.out.println("Chuỗi Vừa Nhập là [" + str + "]");
		try {
			int kq = 5/5;
			System.out.println(kq);
			int haha = Integer.parseInt("20.5");
			System.out.println(haha);
		} 
		catch(ArithmeticException ae){
			System.out.println("Lỗi Toán Học");
			ae.printStackTrace();
		}
		catch(NumberFormatException nfe){
			System.out.println("Lỗi Ép Kiểu");
			nfe.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Có Lỗi");
			e.printStackTrace();
		}
		finally{
			System.out.println("TRỜI SẬP TAO VẪN CHẠY");
		}
		

	}

}
