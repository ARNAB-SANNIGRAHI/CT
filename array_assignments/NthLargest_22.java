package array_assignments;

public class NthLargest_22 {
	static void printNthLargest(int[] a, int n) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[n - 1]);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 40, 30, 20, 50 };
		printNthLargest(arr, 3);
	}
}
