package day15_SetInterface;

import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
	
	tree.put("xyz", 10);
	tree.put("abc", 13);
	tree.put("bac", 30);
	tree.put("ccc", 40);
	tree.put("aaa", 50);
	tree.put("abc", 13);//Duplicate values not allowed
	
	System.out.println(tree);
}
}
