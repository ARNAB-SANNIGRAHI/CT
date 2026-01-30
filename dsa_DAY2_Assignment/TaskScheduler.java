package dsa_DAY2_Assignment;


import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
	public static void main(String[] args) {

		Queue<String> task = new LinkedList<>();

		task.add("Task-1");
		task.add("Task-2");
		task.add("Task-3");
		task.add("Task-4");
		task.add("Task-5");
		
		System.out.println(task);

		while (!task.isEmpty()) {
			System.out.println(task.poll() + " Completed");
		}

	}
}
