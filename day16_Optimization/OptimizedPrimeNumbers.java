package day16_Optimization;

public class OptimizedPrimeNumbers {

    public static int countFactors(int n) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        return countFactors(n) == 2;
    }

    public static void main(String[] args) {
        int n = 29;

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
    }
}
