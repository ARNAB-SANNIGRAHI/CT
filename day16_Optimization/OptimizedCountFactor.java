package day16_Optimization;

public class OptimizedCountFactor {

    public static int countFactors(int n) {
        int ans = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    ans++;
                } else {
                    ans += 2;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println("Number of factors: " + countFactors(n));
    }
}
