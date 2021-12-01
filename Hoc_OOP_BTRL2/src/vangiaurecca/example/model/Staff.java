package vangiaurecca.example.model;

import java.util.ArrayList;

public class Staff {

	private ArrayList<StaffMember> staffList;
	
	public Staff() {
		super();
		staffList = new ArrayList<StaffMember>();
	}
	public Staff(ArrayList<StaffMember> staffList) {
		super();
		this.staffList = staffList;
	}
	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	public void addStaffMember(StaffMember sm){
		staffList.add(sm);
	}
	public void payDay()
	{
		for(StaffMember sm : staffList){
			System.out.println(sm);
		}
	}

}
