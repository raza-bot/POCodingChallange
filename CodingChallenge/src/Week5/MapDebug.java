package Week5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No insertion order. No sync, Allow one null key
		Map<String, Integer> map = new HashMap<>(); 
		
		//Create same hashcode
		String s1 = "FB"; 
		String s2 = "Ea"; 
		System.out.println(s1.hashCode() + ", " + s2.hashCode());
		
		map.put(s1, 1); 
		System.out.println(map.put(s2, 2)); 
		System.out.println(map.put(s2, 2));
		
		map.put("bb", 1); 
		map.putIfAbsent("bb", 10); 
		map.put("bb", 2); 
		map.put(null, 1); 
		map.put("a", 10); 
		map.put("b", 10); 
		map.put("c", 10); 
		map.put("d", 10); 
		map.put("e", 10); 
		map.put("f", 10); 
		map.put("g", 10); 
		map.put("h", 10); 
		map.put("i", 10); 
		map.put("j", 10); 
		map.put("k", 10); 
		
		System.out.println(map.keySet());
		System.out.println(map.containsValue(10));
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		int newValue = map.compute("a", (key, value) ->  value = value + 10);
		System.out.println(newValue);
		
		
		//linkedhashmap: maintains the insertion order by keeping a linkedlist
		//No null key but allow null values Can be sorted by access order (the third argument in consructor)
		//More memory and slower than hash map
		LinkedHashMap<String, Integer> phones = new LinkedHashMap<>(); 
		phones.put("Raza", 10000000); 
		phones.put("jawid", 230000000); 
		phones.put("Saba", 300000000); 
		
		//sorted. Uses Tree datastruture. log(n). Not thread-safe. More methods to navigate
		TreeMap<String, Integer> sortedMap = new TreeMap<>(); 
		
		sortedMap.put("a", 1); 
		sortedMap.put("b", 2); 
		sortedMap.put("d", 3); 
		sortedMap.put("e", 14); 
		sortedMap.put("f", 15); 
		sortedMap.put("g", 111); 
		sortedMap.put("z", -11); 
		sortedMap.put("y", 12); 
		sortedMap.put("x", 16); 
		sortedMap.put("v", 10); 
		sortedMap.put("t", 17); 
		
		
		System.out.println(sortedMap);
		System.out.println(sortedMap.headMap("g", true));
		
		//thread-safe
		ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>(); 
		concurrentMap.put(s2, 222222); 
		concurrentMap.put("abc", 222222); 
		concurrentMap.put("cde", 222222); 
		concurrentMap.put("efg", 222222); 
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
