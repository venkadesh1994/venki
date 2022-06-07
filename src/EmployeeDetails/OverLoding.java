package EmployeeDetails;

public class OverLoding {
	public void emp(int id) {
		System.out.println("employee id is"+ id);
	}
	public void emp(String name) {
		System.out.println("employee name is"+ name);
	}
	public void emp(char age) {
		System.out.println("employee age is  " + age);

	}
		

	
	public static void main(String[] args) {
		OverLoding o = new OverLoding();
		o.emp(2);
		o.emp("loosu");
o.emp(60);	
}

}
