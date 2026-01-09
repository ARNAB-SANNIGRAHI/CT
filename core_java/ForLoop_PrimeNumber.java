package core_java;

public class ForLoop_PrimeNumber {
    public static void main(String[] args) {

        int num = 8;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}
