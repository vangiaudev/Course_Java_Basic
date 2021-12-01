package vangiaurecca.example;

import java.util.Scanner;

public class ToiUuChuoi {

	public static String ToiUu(String s){
		String sToiUu = s;
		sToiUu = s.trim();
		String []arrWord = sToiUu.split(" ");
		sToiUu = "";
		for(String word : arrWord){
			String newWord = word.toLowerCase();
			if(newWord.length() > 0){
				newWord = newWord.replaceFirst(newWord.charAt(0)+"", (newWord.charAt(0)+"").toUpperCase());
				sToiUu += newWord + " ";
			}
		}
		return sToiUu;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap chuoi: ");
		String s = sc.nextLine();
		System.out.println(ToiUu(s));
		
	}

}
