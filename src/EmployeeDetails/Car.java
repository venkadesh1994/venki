package EmployeeDetails;

public class Car {
	public  Car() {
System.out.println("Car details");
	}
public Car(String name) {
	System.out.println("Car name is,"+name);
}
public static void main(String[] args) {
	Car c = new Car();
	Car c1 = new Car("Scoda");
} 
}
