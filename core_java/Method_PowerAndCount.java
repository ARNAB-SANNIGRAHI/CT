package core_java;

public class Method_PowerAndCount {

    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int pow(int b, int p) {
        int pow = 1;
        while (p > 0) {
            pow = pow * b;
            p--;
        }
        return pow;
    }

    static int powerSum(int num, int power) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += pow(digit, power);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int number = 153;

        int digits = countDigits(number);
        int result = powerSum(number, digits);

        System.out.println("Number: " + number);
        System.out.println("Number of digits: " + digits);
        System.out.println("Sum of digits raised to power: " + result);
    }
}
