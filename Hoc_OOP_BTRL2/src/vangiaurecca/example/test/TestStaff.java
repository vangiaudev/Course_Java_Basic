package vangiaurecca.example.test;

import vangiaurecca.example.model.Employee;
import vangiaurecca.example.model.Excutive;
import vangiaurecca.example.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st = new Staff();
		Employee teo = new Employee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("0385647273");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC123");
		st.addStaffMember(teo);
		
		Employee ty = new Employee();
		ty.setName("Trần Văn Tý");
		ty.setAddress("Quận 2");
		ty.setPhone("0985647273");
		ty.setPayRate(0.14);
		ty.setSocialSecurityNumber("SEC456");
		st.addStaffMember(ty);
		Excutive an = new Excutive();
		an.setName("Hồ Văn An");
		an.setAddress("Quận 3");
		an.setPhone("0785647273");
		an.setPayRate(0.16);
		an.setSocialSecurityNumber("SEC789");
		an.awardBonus(100);
		st.addStaffMember(an);
		st.payDay();
		
	}

}
