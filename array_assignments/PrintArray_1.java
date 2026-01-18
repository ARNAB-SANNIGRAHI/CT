package array_assignments;

public class PrintArray_1 {
	static void array(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		array(arr);
	}
}
