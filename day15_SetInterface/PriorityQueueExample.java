package day15_SetInterface;
import java.util.PriorityQueue;
public class PriorityQueueExample {
public static void main(String[] args) {
	PriorityQueue<Integer> a = new PriorityQueue<Integer>();
	
	a.add(10);
	a.add(12);
	a.offer(100);
	a.offer(52);
	a.offer(12);
	a.add(10);
	a.add(15);
	
	System.out.println(a);
}
}
//It keeps the duplicates also