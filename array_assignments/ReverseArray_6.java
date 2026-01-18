package array_assignments;

public class ReverseArray_6 {
	static void reverse(int[] a) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr);
	}
}
