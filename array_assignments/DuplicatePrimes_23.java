package array_assignments;

public class DuplicatePrimes_23 {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void printDuplicatePrimes(int[] a) {
		boolean[] visited = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (visited[i] || !isPrime(a[i]))
				continue;

			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count > 1) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 3, 7, 2, 11, 5, 13 };
		printDuplicatePrimes(arr);
	}
}
