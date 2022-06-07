package EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

public class Collection {
public static void main(String[] args) {
	List<Integer> li = new ArrayList<Integer>();
	li.add(12);
	li.add(5);
	li.add(1);
	System.out.println(li);
	li.add(3, 80);
	System.out.println(li);
	boolean contains = li.contains(5);
	System.out.println(contains);
	
}
}
