package com.java;

public class Immutable {
public static void main(String[] args) {
	
	String s = "Good";
	String  s1="Morning";
	String s2="Good";
	
	
	System.out.println(System.identityHashCode(s));
	
	System.out.println(System.identityHashCode(s1));
	
	System.out.println(System.identityHashCode(s2));
	
	String concat = s.concat(s2);
	System.out.println(System.identityHashCode(concat));
	
	
	
}
}
