package com.java;

public class overLoading {
	
	public  void std(int id) {
System.out.println("std id is"+id);
	}
public  void std(String name) {
System.out.println("std name is"+name);
}

public    void std(long num) {
System.out.println("std num is"+num);
	
}

public static void main(String[] args) {
	overLoading ol = new overLoading();
	ol.std(17);
    ol.std("venki");
    ol.std(987654321);
}
//if not static in method at the time instantiating 
//the create object we can call
// long also not accept in static in method
}
