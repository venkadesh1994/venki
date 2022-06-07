package EmployeeDetails;

public class Overloading {
public void emp(int id) {
	System.out.println("Employee is: "+id);
}
public void emp(String name) {
	System.out.println("Employee name is;"+name);
}
public void emp(long num) {
	System.out.println("Employee num is; "+num);
}
public static void main(String[] args) {
	Overloading o = new Overloading();
	o.emp(8);
	o.emp("venki");
	o.emp(814899505);
			
}
	}


