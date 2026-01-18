package array_assignments;

public class FibonacciInArray_16 {
	static boolean isFibonacci(int n) {
		int a = 0, b = 1;
		if (n == 0 || n == 1)
			return true;
		while (b < n) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b == n;
	}

	static void printFibonacci(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (isFibonacci(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 5, 6, 8, 10, 13 };
		printFibonacci(arr);
	}

}
