package day25_DSALambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddUsingList {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		System.out.println(filterOdd(arr));
	}

	public static List<Integer> filterOdd(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int element : arr) {
			if ((element & 1) == 0) {
				list.add(element);
			}

		}
		return list;

	}
}
