package EmployeeDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Arraylist {
	public static void main(String[] args) {

		Map<Integer, Object> m = new HashMap<>();
m.put(1, 40);
m.put(2, 20);
m.put(3, 30);
m.put(5, 30);
m.put(5, 30);		
		
		System.out.println(m);

		
		boolean empty = m.isEmpty();
		System.out.println(empty);
	
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	
	Set<Entry<Integer,Object>> entrySet = m.entrySet();
	System.out.println(entrySet);
	
	boolean containsValue = m.containsValue(m);
	System.out.println(containsValue);
	
	}

}
