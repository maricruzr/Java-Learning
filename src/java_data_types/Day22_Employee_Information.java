package java_data_types;

public class Day22_Employee_Information {
	
	private String name;
	private int ssn;
	private boolean graduated;
	
	// how to do setter with constructor 
	Day22_Employee_Information(String name, int ssn, boolean graduated){
		this.name = name;
		this.ssn = ssn;
		this.graduated = graduated;
	}
	
	//public void setgraduated(boolean graduated) {
		//this.graduated = graduated;
	//}
	public boolean getgraduated() {
		return graduated;
	}
	//public void setname(String name) {
		//this.name = name;
	//}
	public String getname() {
		return name;
	}
	//public void setssn(int ssn) {
		//this.ssn = ssn;
	//}
	public int getssn() {
		return ssn;
	}
	

}
