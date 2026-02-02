package dsa_DAY3_Assignment;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 3, 43, 52, 12 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
//Time Complexity
//Best case: O(n²)
//Average case: O(n²)
//Worst case: O(n²)