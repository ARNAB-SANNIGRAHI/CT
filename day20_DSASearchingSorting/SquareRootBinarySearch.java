package day20_DSASearchingSorting;

import java.util.Scanner;

public class SquareRootBinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(squareRoot(n));
		sc.close();
	}

	public static int squareRoot(int n) {
		int start = 0;
		int end = n;
		int ans = 0;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if ((long) mid * mid == n) {
				return mid;
			} else if ((long) mid * mid < n) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}
}
