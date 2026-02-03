package day21_DSARecursionDp;

import java.util.Arrays;

public class RecursionSample {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7};
	System.out.println(Arrays.toString(arr));
	modify(arr);
	System.out.println(Arrays.toString(arr));
} 
private static void modify(int[] arr) {
	arr[0] = Integer.MIN_VALUE;
}
}
