package day15_SetInterface;

import java.util.*;

public class ListIterator_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		ListIterator<Integer> li = list.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("--------------------------");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
