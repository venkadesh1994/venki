package com.java;

public class B_abstct extends A_abstrct {

	@Override
	void display() {

		System.out.println("display is led");
	}

	
	public static void main(String[] args) {
		
		B_abstct b = new B_abstct();
		b.display();
		
		
		
	}
	
	
	
	
}
