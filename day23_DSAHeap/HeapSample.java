package day23_DSAHeap;

import java.util.PriorityQueue;

public class HeapSample {
public static void main(String[] args) {
	/*
	 * 
	 * parent = (i-1)/2
	 * left child = 2*i+1
	 * right child = 2*i+2
	 * 
	 */
	
	PriorityQueue<Integer> queue = new PriorityQueue<>();
	queue.add(12);	//  add and offer methods both are same
	queue.offer(14);
	queue.offer(25);
	queue.offer(87);
	queue.offer(85);
	queue.offer(10);
	
	System.out.println(queue);
	
	
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	
	System.out.println(queue);
	
	
}
}
