package day23_DSAHeap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortingElement {
public static void main(String[] args) {
	
	PriorityQueue<Integer> queue = new PriorityQueue<>();
	queue.add(12);	//  add and offer methods both are same
	queue.offer(14);
	queue.offer(25);
	queue.offer(87);
	queue.offer(85);
	queue.offer(10);
	
	System.out.println(queue);
	
	List<Integer> list = new ArrayList<>(queue.size());
	
	while(!queue.isEmpty()) {
		list.add(queue.poll());
	}
	
	System.out.println(list);
}
}
