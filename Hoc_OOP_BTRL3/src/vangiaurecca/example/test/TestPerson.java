package vangiaurecca.example.test;

import java.util.ArrayList;

import vangiaurecca.example.model.Man;
import vangiaurecca.example.model.Person;
import vangiaurecca.example.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> dsPerson = new ArrayList<Person>();
		Person an = new Man();
		an.setFirstName("AN");
		Person hong = new Woman();
		hong.setFirstName("HỒNG");
		((Woman)hong).setWearingMakup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p : dsPerson){
			if(p instanceof Man){
				System.out.println(p.getFirstName() + "là Nam");
			}
			else if(p instanceof Woman){
				System.out.println(p.getFirstName() + "là Nữ");
			}
		}
		
	}

}
