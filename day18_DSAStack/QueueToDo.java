package day18_DSAStack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToDo {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.add("Task-1");
		queue.add("Task-2");
		queue.add("Task-3");
		queue.add("Task-4");
		queue.add("Task-5");
		
		System.out.println(queue);

		while (!queue.isEmpty()) {
			System.out.println(queue.poll() + " Completed");
		}

	}
}