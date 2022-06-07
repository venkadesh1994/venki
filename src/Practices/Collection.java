package Practices;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collection {
public static void main(String[] args) {
Map<Integer, Object> m= new TreeMap<>();

	m.put(1, 10);
	m.put(2, "java");
	m.put(3, 12.56);
	m.put(4, true);
	m.put(5, 10);
	
	System.out.println(m);
	
	Object object = m.get(4);
	System.out.println(object);
	
	boolean containsKey = m.containsKey(6);
	System.out.println(containsKey);
	
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
		
	java.util.Collection<Object> values = m.values();
	System.out.println(values);
	
	Set<Entry<Integer,Object>> entrySet = m.entrySet();
	for (Entry<Integer, Object> entry : entrySet) {
		System.out.println(entry);
	}
		}
	}
	
	



