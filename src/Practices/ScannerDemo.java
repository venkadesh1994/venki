package Practices;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter your id");
	int nextInt = s.nextInt();
	System.out.println("you have entered id");
	 
	System.out.println("enter your name");
	String next2 = s.next();
	System.out.println("you have entered name");
	
	s.nextLine();
	System.out.println("enter your msg");
	String msg = s.nextLine();
	System.out.println("you have entered msg");
}
}
