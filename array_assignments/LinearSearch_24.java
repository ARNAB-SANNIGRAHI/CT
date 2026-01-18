package array_assignments;

public class LinearSearch_24 {
	static void linearSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println("Element found at index: " + i);
				return;
			}
		}
		System.out.println("Element not found");
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		linearSearch(arr, 30);
	}
}
