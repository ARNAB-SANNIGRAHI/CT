package array_assignments;

public class ProductOfElements_5 {
	static void printProduct(int[] a) {
		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			prod *= a[i];
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printProduct(arr);
	}
}
