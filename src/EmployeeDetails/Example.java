package EmployeeDetails;

public final class Example extends Keywords {
	int b=1;

	public  void emp() {

	int c=2;
		System.out.println("local variable is;"+c);
		System.out.println("current class variable;"+this.b);
		System.out.println("parent class variable;"+super.a);

	}
public static void main(String[] args) {
	Example e=new Example();
	e.std();
	e.emp();
}
	}
	


