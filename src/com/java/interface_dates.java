package com.java;

public class interface_dates implements interface_events,interface_celebrate {

	@Override
	public void pongal() {
System.out.println("jan14");		
	}

	@Override
	public void welcomeday() {
System.out.println("wecome day is 30/4");		
	}

	@Override
	public void fresherday() {
System.out.println("fresher day is 29/04");		
	}

	public static void main(String[] args) {
		
		interface_dates id = new interface_dates();
		id.fresherday();
		id.pongal();
		id.welcomeday();
		
		
	}
	
	
	
}
