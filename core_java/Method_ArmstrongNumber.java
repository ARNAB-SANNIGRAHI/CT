package core_java;

import java.util.Scanner;

public class Method_ArmstrongNumber {

    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static int pow(int b, int p) {
        int pow = 1;
        while (p > 0) {
            pow = pow * b;
            p--;
        }
        return pow;
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}
