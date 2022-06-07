package com.java;

public class Muttable {
public static void main(String[] args) {
	
	
StringBuffer s = new StringBuffer("good");
StringBuffer s1= new StringBuffer("Morning");
StringBuffer s2= new StringBuffer("good");
	
System.out.println(System.identityHashCode(s));

System.out.println(System.identityHashCode(s1));

System.out.println(System.identityHashCode(s2));

StringBuffer append = s.append(s2);
System.out.println(System.identityHashCode(append));







	
	
}
}
