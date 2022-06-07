package EmployeeDetails;

public class Riding {
	public void empNum(int Num) {
		System.out.println("employee num is"+ Num);
		}
	public void empName(String Name) {
		System.out.println("employee Name is"+ Name);

	}
	public static void main(String[] args) {
		Riding r = new Riding();
		r.empName("venki");
		r.empNum(125);
	}

}
