package day14_CollectionFramework;
import java.util.*;
public class AL {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("o");
		a2.add("o");
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2,a2);//index, collection o elements
		System.out.println(a1);
	}

}
