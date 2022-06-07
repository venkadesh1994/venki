package EmployeeDetails;

import java.util.LinkedList;
import java.util.List;

public class Collection1 {
	public static void main(String[] args) {
		List<Integer> li =new LinkedList<>();
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
		System.out.println(li);
		li.add(2, 7);
		System.out.println(li);
		boolean contains = li.contains(7);
	System.out.println(contains);
	int indexOf = li.indexOf(7);
	System.out.println(indexOf);
	int lastIndexOf = li.lastIndexOf(5);
		System.out.println(lastIndexOf);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
