package EmployeeDetails;

public class Overridding extends Riddding{
	@Override
	public void empHeight() {
		super.empHeight();
	}
	@Override
	public void empNative() {
		super.empNative();
	}
	public static void main(String[] args) {
		Overridding o = new Overridding();
		o.empHeight();
		o.empNative();
	}

}
