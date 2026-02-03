package dsa_DAY4_Assignment;

public class RodCutting {

    public static int rodCutting(int[] price, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                maxVal = Math.max(maxVal, price[j] + dp[i - j - 1]);
            }
            dp[i] = maxVal;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;

        System.out.println("Maximum obtainable value: " + rodCutting(price, n));
    }
}

//Time Complexity: O(n²)
//Space Complexity: O(n)