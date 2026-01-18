package array_assignments;

public class LargestElement_9 {
	static void printLargest(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 43, 24, 54, 22 };
		printLargest(arr);
	}
}
