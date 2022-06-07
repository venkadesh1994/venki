package com.java;

import java.util.Scanner;

//scanner is used to user input


public class scanner_java {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter your id");
    int id = s.nextInt();
    System.out.println("you have entered id is"+id);

System.out.println("enter your name");
String name = s.next();
System.out.println("you have entered name "+name);


s.nextLine();
System.out.println("enter tour feedback");
String message = s.nextLine();
System.out.println("you have entered msg"+message);


}
}
