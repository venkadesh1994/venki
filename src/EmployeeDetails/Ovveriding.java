package EmployeeDetails;

public class Ovveriding extends Riding {

@Override
public void empName(String Name) {
	super.empName(null);
}
public static void main(String[] args) {
	Ovveriding o = new Ovveriding();
	o.empName(null);
}
	}


