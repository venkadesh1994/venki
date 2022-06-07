package EmployeeDetails;

import java.util.List;
import java.util.Vector;

public class Collection2 {

	public static void main(String[] args) {
		List<Object> li = new Vector<Object>();
		li.add("R");
		li.add("class");
		li.add(67);
		li.add("a");
		System.out.println(li);
		 List<Object>l=new Vector<Object>();
		 l.add(45);
		 l.add(65);
		 l.add(2);
		 System.out.println(l);
		 li.addAll(l);
		 System.out.println(li);
		 li.remove("a");
		 System.out.println(li);
		 boolean contains = l.contains(65);
		 System.out.println(contains);
	}

}
