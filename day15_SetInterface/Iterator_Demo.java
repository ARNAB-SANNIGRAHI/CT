package day15_SetInterface;
import java.util.*;

public class Iterator_Demo {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	Iterator<Integer> i = list.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
//	System.out.println(i.hasNext());
//	System.out.println(i.next());
//	System.out.println(i.hasNext());
//	System.out.println(i.next());
//	System.out.println(i.hasNext());
//	System.out.println(i.next());
//	System.out.println(i.hasNext());
//	System.out.println(i.next());
//	System.out.println(i.hasNext());
//	System.out.println(i.next());
	
}
}
