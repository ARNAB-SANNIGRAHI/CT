package array_assignments;

public class RightRotate_19 {
	static void rightRotate(int[] a) {
		int n = a.length;
		int last = a[n - 1];
		for (int i = n - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = last;

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		rightRotate(arr);
	}
}
