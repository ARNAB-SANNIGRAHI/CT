package array_assignments;

public class ReverseNewArray_8 {
	static void reverse(int[] a) {
		int[] b = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr);
	}
}
