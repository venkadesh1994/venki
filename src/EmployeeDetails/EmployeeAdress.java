package EmployeeDetails;

public class EmployeeAdress extends EmpolyeeCondactDetails  {

	public void empAdress(String address) {
System.out.println("Emloyee Adress is "+address);
	}
	public static void main(String[] args) {
		EmployeeAdress eA = new EmployeeAdress();
		eA.empDegree();
		eA.empFathername();
		eA.empmotherName();
		eA.empAdress("Rajapalayam");
	}
	
	
	}


