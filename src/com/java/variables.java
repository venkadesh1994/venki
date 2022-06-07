package com.java;

public class variables {
   
	 //variable is  piece of memory and it can store the vale in data.
	//the local variable should be assigned by value
	//class variable need not assigned by value, if not assign the value 
	  //default value 0 is automatically executed.
	
	 int b;//class  variable
	static int c =30;//static variable
	
	public void stdId() {
        int a =10;//local variable
        System.out.println("value for a is "+ a);
		//System.out.println("value for b is "+c);
	}
	public static void main(String[] args) {
		variables v = new variables();
		v.stdId();
		System.out.println(v.b);
		System.out.println(v.c);
	}
	
}
