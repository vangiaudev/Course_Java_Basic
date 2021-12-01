package vangiaurecca.example.model;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	public TamGiac(){
		this.canhA = this.canhB = this.canhC = 1;
	}
	public TamGiac(double canhA, double canhB, double canhC){
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	public void setCanhA(double canhA){
		this.canhA = canhA;
	}
	public void setCanhB(double canhB){
		this.canhB = canhB;
	}
	public void setCanhC(double canhC){
		this.canhC = canhC;
	}
	public double getCanhA(){
		return this.canhA;
	}
	public double getCanhB(){
		return this.canhB;
	}
	public double getCanhC(){
		return this.canhC;
	}
	public double tinhChuVi(){
		return this.canhA + this.canhB + this.canhC;
	}
	private double tinhNuaChuVi(){
		return tinhChuVi()/2;
	}
	public double tinhDienTich(){
		double p = tinhNuaChuVi();
		return Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
	}
}
