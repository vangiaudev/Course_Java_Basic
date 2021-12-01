package vangiaurecca.example.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileFactory {
	public static boolean luuFile(ArrayList<String> dsData, String path){
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for(String data : dsData){
				bw.write(data);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList<String> docFile(String path){
		ArrayList<String> dsData = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line != null){
				if(line.length() > 0){
					dsData.add(line);
				}
				line = br.readLine();
			}
			br.close();fis.close();isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsData;
	}
}
