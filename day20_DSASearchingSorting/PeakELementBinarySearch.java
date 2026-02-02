package day20_DSASearchingSorting;

public class PeakELementBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 8, 6, 3, 0 };
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] < arr[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		System.out.println(arr[low]);
	}
}
