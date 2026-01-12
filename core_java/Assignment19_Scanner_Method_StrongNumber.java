package core_java;
import java.util.Scanner;
public class Assignment19_Scanner_Method_StrongNumber {
	 static int factorial(int digit) {
	        int fact = 1;
	        for (int i = 1; i <= digit; i++) {
	            fact = fact * i;
	        }
	        return fact;
	    }
	    static boolean isStrongNumber(int num) {
	        int original = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum = sum + factorial(digit);
	            num = num / 10;
	        }

	        return sum == original;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong Number.");
	        } else {
	            System.out.println(number + " is not a Strong Number.");
	        }

	        sc.close();
	    }
}
