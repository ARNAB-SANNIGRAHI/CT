package day15_SetInterface;
import java.util.HashSet;
public class HashSetExample_NonGeneric {
public static void main(String[] args) {
	HashSet set = new HashSet();
	set.add("A");
	set.add(88);
	set.add(null);
	set.add('a');
	set.add(2.2f);
	set.add("A");//Duplicate so it will be removed
	
	System.out.println(set);
	
}
}
//It does not maintains any order