package EmployeeDetails;

public class Method {
	public static void main(String[] args) {
		String s=("Welcome to JAVA online class");
		int length = s.length();
		System.out.println(length);
		
		boolean equals = s.equals("Welcome to java online class");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Welcome to JAVA online class");
		System.out.println(equalsIgnoreCase);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		int indexOf = s.indexOf("A");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("s");
		System.out.println(lastIndexOf);
		
		boolean contains = s.contains("java");
		System.out.println(contains);
		
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		s.startsWith(lowerCase);
		boolean endsWith = s.endsWith("s");
		System.out.println(endsWith);
		String substring = s.substring(9);
		System.out.println(substring);
		
	}

}
