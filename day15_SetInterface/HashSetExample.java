package day15_SetInterface;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		
	//Create an HashSet
	HashSet<Integer> a1 = new HashSet<Integer>();// It is generic
	
	//Add elements in HashSet
	a1.add(1);
	a1.add(2);
	a1.add(5);
	a1.add(3);
	a1.add(4);
	
	//Prints the HashSet
	System.out.println(a1);
}
}
