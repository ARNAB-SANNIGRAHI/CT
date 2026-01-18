package array_assignments;

public class PrimeInArray_15 {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void printPrimes(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		printPrimes(arr);
	}
}
