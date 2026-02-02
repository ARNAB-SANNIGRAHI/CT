package dsa_DAY3_Assignment;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 8, 2, 1, 3 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i -1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i +" ");
		}
	}
}
//Time Complexity
//Best case: O(n) (already sorted, no swaps)
//Average case: O(n²)
//Worst case: O(n²) (reverse sorted)