package vangiaurecca.example.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import vangiaurecca.example.model.Contact;

public class SerializeFileFactory {
	public static boolean saveFile(HashMap<Integer, Contact> csdl, String path)
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(csdl);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public static HashMap<Integer, Contact> readFile(String path){
		HashMap<Integer, Contact> csdl = new HashMap<Integer, Contact>();
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			ois.close();
			fis.close();
			csdl = (HashMap<Integer, Contact>) data;
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return csdl;
	}
}
