package EmployeeDetails;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter the your id;");
  int id = s.nextInt();
  System.out.println("you have entered the id is"+id);
  
  System.out.println("enter the name ");
  String name = s.next();
  System.out.println("you have entered the name is"+ name);
  
  System.out.println("enter your feedback");
String msg = s.nextLine();
System.out.println("your feed back"+ msg);
s.nextLine();
	}
	
}

