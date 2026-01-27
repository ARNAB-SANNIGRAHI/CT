package day15_SetInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//map.put("key", "value");
		map.put(66, "xyz");
		map.put(25, "bac");
		map.put(2, "aaa");
		map.put(66, "abc");
		
		System.out.println(map.get(2));
		
		System.out.println(map.getOrDefault(20, "Raju"));
		
		System.out.println(map);
		
		Collection<String> a1 = map.values();
		System.out.println(a1);//prints the values only
		
		Set<Integer> set = map.keySet();
		System.out.println(set);//prints the keys as a set
		
	}
}
//keys should be unique
//Repetition of key will reassign the value
//In replace if key is present there it will replace the value otherwise print null