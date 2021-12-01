package vangiaurecca.example;

import java.util.Random;
import java.util.Scanner;

public class SoNgauNhien {

	public static void Play(){
		Random rd = new Random();
		int soMay = rd.nextInt(101);
		System.out.println("Máy đã ra 1 số từ [0->100] mời Thím đoán:");
		int soNguoi;
		int soLanDoan = 0;
		while(soLanDoan <= 7){
			System.out.println("Bạn đoán số gì?");
			soNguoi = new Scanner(System.in).nextInt();
			soLanDoan++;
			if(soNguoi == soMay)
			{
				System.out.println("Chúc mừng Thím đoán đúng số máy +" + soMay);
				break;
			}
			if(soNguoi < soMay){
				System.out.println("Thím đoán sai! Số Máy > Số Thím");
			}
			else{
				System.out.println("Thím đoán sai! Số Máy < Số Thím");
			}
			if(soLanDoan == 7){
				System.out.println("Thím đã Cáo Phó, vì sai 7 lần");
				break;
			}
		}
	}
	public static void main(String[] args) {
		while(true){
			Play();
			System.out.println("Chơi nữa ko Thím?(c/k)");
			String rep = new Scanner(System.in).nextLine();
			if(rep.equalsIgnoreCase("k")){
				break;
			}
		}
		System.out.println("Tạm biệt THÍM");
	}

}
