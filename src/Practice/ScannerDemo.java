package Practice;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = s.nextInt();
		System.out.println("you have entered id"+ id);
		
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("you have entered name"+name);
	
		s.nextLine();
		System.out.println("enter your number");
		long number = s.nextLong();
		System.out.println("you have entered number"+number);
		
		
	}
	

}
