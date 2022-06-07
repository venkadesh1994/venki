package com.java;

public class demo_const {

	public   demo_const() {

		System.out.println("non parameterized");
	}
	
public demo_const(String name) {
	
	System.out.println("name is "+name);
}
public static void main(String[] args) {
	demo_const dc = new demo_const();
	demo_const dc1 = new demo_const("venkat");
	}
	
// it cannot be initiate the static because,
//which is non static method
// final keyword also cannot initiate.



}
