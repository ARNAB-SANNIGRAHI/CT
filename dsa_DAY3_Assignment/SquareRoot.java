package dsa_DAY3_Assignment;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (i * i == n) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Not found");
		}

		sc.close();
	}
}
