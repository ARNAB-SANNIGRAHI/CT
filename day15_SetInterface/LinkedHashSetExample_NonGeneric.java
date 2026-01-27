package day15_SetInterface;
import java.util.LinkedHashSet;
public class LinkedHashSetExample_NonGeneric {
public static void main(String[] args) {
	LinkedHashSet set = new LinkedHashSet();
	set.add("A");
	set.add(88);
	set.add(null);
	set.add('a');
	set.add(2.2f);
	set.add("A");
	
	System.out.println(set.contains("A"));//true
	System.out.println(set.contains(88));//true
	System.out.println(set);
	
}
}
//It maintains proper order