package day23_DSAHeap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequent {
	public static List<Integer> topKFrequent(int[] nums, int k) {		
		HashMap<Integer, Integer> frequency = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>(
				(Integer o1, Integer o2) -> frequency.get(o1) - frequency.get(o2));
		Set<Integer> key = frequency.keySet();
		for (Integer element : key) {
			queue.add(element);

			if (queue.size() > k)
				queue.poll();
		}
		return new ArrayList<>(queue);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 2, 2, 4, 1, 4, 6 };
		int k = 2;

		System.out.println(topKFrequent(arr, k));
	}
}
// Time complexity -> O(n log k)