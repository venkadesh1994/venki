
package Practices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatativeWords {
	public static void main(String[] args) {
		String s= "For the people of the people by the people";
		
		String[] split = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<>();
		
		for (String x: split) {
			
			if (m.containsKey(x)) {
				
				Integer i = m.get(x);
				m.put(x, i+1);
			}
				else {
					m.put(x, 1);
			}
			//System.out.println(x);
			
		}
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	





























