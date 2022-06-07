package com.java;

public class dataType {

	
	public void empId(int a) {

System.out.println("emp id is"+a);		
		}
	public void empName(String name) {

		System.out.println("emp name is"+name );
	}
	
	public static void main(String[] args) {
		dataType d = new dataType();
		d.empId(10);
		d.empName("venki");
		
		
	}
	
}
