package day21_DSARecursionDp;

import java.util.Arrays;

public class FibonacciRecursion {
public static void main(String[] args) {
	int num=6;
	int[] dp = new int[num+1];
	Arrays.fill(dp, -1);
	System.out.println(fibonacci(num,dp));
}
public static int fibonacci(int num, int[] dp) {
		if(num<=1) {
			return num;
		}
		if(dp[num]!=-1) {
			return dp[num];
		}
		dp[num] = fibonacci(num-1,dp)+fibonacci(num-2,dp);
		return dp[num];
}
}
