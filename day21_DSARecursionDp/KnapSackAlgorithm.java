package day21_DSARecursionDp;

public class KnapSackAlgorithm {

	public static void main(String[] args) {
		int[] value = {25, 24, 15};
		int[] weight = {18, 15, 10};
		int capacity = 20;

		int n = value.length;

		System.out.println(knapSack(capacity, weight, value, n));
	}

	public static int knapSack(int W, int[] wt, int[] val, int n) {

		// Base case
		if (n == 0 || W == 0) {
			return 0;
		}

		// If weight of nth item is more than capacity, skip it
		if (wt[n - 1] > W) {
			return knapSack(W, wt, val, n - 1);
		}

		// Either include or exclude the item
		return Math.max(
				val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
				knapSack(W, wt, val, n - 1)
		);
	}
}
