package core_java;

import java.util.Scanner;

public class PalindromeAndPrime {

    boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return original == reverse;
    }

    // Method to check prime
    boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Main method (Driver)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Create object of same class
        PalindromeAndPrime p = new PalindromeAndPrime();

        // Taking input
        System.out.print("Enter first number (Palindrome check): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number (Prime check): ");
        int num2 = sc.nextInt();

        // Storing results
        boolean palindromeResult = p.isPalindrome(num1);
        boolean primeResult = p.isPrime(num2);

        // Displaying output
        if (palindromeResult)
            System.out.println(num1 + " is a Palindrome number");
        else
            System.out.println(num1 + " is NOT a Palindrome number");

        if (primeResult)
            System.out.println(num2 + " is a Prime number");
        else
            System.out.println(num2 + " is NOT a Prime number");

        sc.close();
    }
}
