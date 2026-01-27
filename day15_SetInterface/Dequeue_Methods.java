package day15_SetInterface;
import java.util.*;

public class Dequeue_Methods {
public static void main(String[] args) {
	Deque<Integer> a = new ArrayDeque<Integer>();
	a.add(10);
	a.add(11);
	a.add(12);
	a.add(13);
	a.add(10);

	
	System.out.println(a);
	
	a.addFirst(20);  //a.offerFirst(20);  ->Same
	a.addLast(90);  //a.offerLast(90);  ->Same
	
	System.out.println("Updated list after adding elements: "+a);
	
	a.removeFirst();  //a.pollFirst();  ->Same
	a.removeLast();  //a.pollLast();  ->Same
	
	System.out.println("Updated list after removing elements: "+a);
	
	System.out.println("First Element: "+a.getFirst());  //a.peekFirst();  ->Same
	System.out.println("Last element: "+a.getLast());  //a.peekLast();  ->Same
	
	
}
}
