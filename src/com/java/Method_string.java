package com.java;

public class Method_string {
public static void main(String[] args) {
	
	String s = "welcome to java online class";
	
	int length = s.length();
	System.out.println(length);
	
	boolean contains = s.contains("Java");
	System.out.println(contains);
	
	char charAt = s.charAt(8);
	System.out.println(charAt);
	
	boolean equals = s.equals("To");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to JAVA Online class");
	System.out.println(equalsIgnoreCase);
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	String replace = s.replace("w", "W");
	System.out.println(replace);
	
	String concat = s.concat(lowerCase);
	System.out.println(concat);
	
	
}
}
