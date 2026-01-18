package array_assignments;

public class LeftRotate_20 {
	static void leftRotate(int[] a) {
		int n = a.length;
		int first = a[0];
		for (int i = 0; i < n - 1; i++) {
			a[i] = a[i + 1];
		}
		a[n - 1] = first;

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		leftRotate(arr);
	}
}
