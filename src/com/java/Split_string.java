package com.java;

public class Split_string {
public static void main(String[] args) {
	
	
	String s ="welcome to java online class";
	
	String[] split = s.split(" ");
	
	for (int i = 0; i < split.length; i++) {
		
		System.out.println(split[i]);
	}
	
	String[] split2 = s.split("", 7);
	for (String y : split2) {
		System.out.println(y);
	}
	
	
	
}
}
