package dsa_DAY3_Assignment;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int k = 20;

		int search = linearSearch(arr, k);
		System.out.println(search);
	}

	public static int linearSearch(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}
}
