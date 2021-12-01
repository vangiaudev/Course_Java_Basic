package vangiaurecca.example.model;

public class Excutive extends Employee {
	private double bonus;
	public void awardBonus(double bonus){
		this.bonus = bonus;
		System.out.println("Lãnh thưởng =" +bonus);
	}
	public double pay(){
		return super.pay() + this.bonus;
	}
}
