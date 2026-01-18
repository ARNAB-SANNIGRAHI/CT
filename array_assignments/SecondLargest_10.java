package array_assignments;

public class SecondLargest_10 {
	static void printSecondLargest(int[] a) {
		int max = a[0];
		int second = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				second = max;
				max = a[i];
			} else if (a[i] < max && a[i] > second) {
				second = a[i];
			}
		}
		System.out.println(second);
	}

	public static void main(String[] args) {
		int[] arr = { 32, 63, 58, 43, 55 };
		printSecondLargest(arr);
	}
}
