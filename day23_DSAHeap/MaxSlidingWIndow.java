package day23_DSAHeap;

import java.util.ArrayList;
import java.util.List;

public class MaxSlidingWIndow {
	public static void main(String[] args) {
		int[] arr = { -1, 1, 3, 4, -2, 4, 6, 8 };
		int k = 3;
		System.out.println(maxSlidingWindow(arr, k));
	}

	public static List<Integer> maxSlidingWindow(int[] nums, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = nums.length;
		for (int i = 0; i <= n - k; i++) {
			int max = nums[i];
			for (int j = 0; j < i + k; j++) {
				max = Math.max(max, nums[j]);
			}
			list.add(max);
		}
		return list;
	}
}