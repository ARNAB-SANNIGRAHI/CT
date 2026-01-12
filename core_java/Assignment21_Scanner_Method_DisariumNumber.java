package core_java;
import java.util.Scanner;
public class Assignment21_Scanner_Method_DisariumNumber {
	    static void checkDisarium(int num) {
	        int temp = num;
	        int sum = 0;
	        int digits = String.valueOf(num).length();

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digits);
	            digits--;
	            temp = temp / 10;
	        }

	        if (sum == num) {
	            System.out.println(num + " is a Disarium number");
	        } else {
	            System.out.println(num + " is not a Disarium number");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        checkDisarium(number);
	        sc.close();
	}

}
