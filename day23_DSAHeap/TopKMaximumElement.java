package day23_DSAHeap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKMaximumElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 8, 7, 9, 5, 4, 3 };
		int k = 2;
		
		System.out.println(topKMaximumElement(arr, k));

	}

	public static List<Integer> topKMaximumElement(int[] nums, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int num : nums) {
			queue.add(num);

			if (queue.size() > k) {
				queue.poll();

			}
		}
		return new ArrayList<>(queue);
	}
}
