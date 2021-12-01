package vangiaurecca.example.test;

import java.util.ArrayList;

import vangiaurecca.example.io.FileFactory;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> dsData = new ArrayList<String>();
//		dsData.add("Tèo");
//		dsData.add("Kevin");
//		dsData.add("Dias");
//		dsData.add("Stones");
//		
//		boolean kq = FileFactory.luuFile(dsData, "D:/dulieu.txt");
//		if(kq == true)
//			System.out.println("Luu thanh cong");
//		else
//			System.out.println("Luu that bai");
		ArrayList<String> ds = FileFactory.docFile("D:/dulieu.txt");
		for(String va : ds){
			System.out.println(va);
		}
	}

}
