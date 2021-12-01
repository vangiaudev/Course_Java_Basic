package vangiaurecca.example;

import java.util.Scanner;

public class BTRL_Pannydrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap chuoi: ");
		String s = sc.nextLine();
		char []arr = s.toCharArray();
		boolean flag = true;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != arr[arr.length - 1 - i]){
				flag = false;
				break;
			}
			
		}
		if(flag){
			System.out.println(s+ " Chuoi la Pannydrome");
		}
		else{
			System.out.println(s + " khong phai Pannydrome");
		}
	}

}
