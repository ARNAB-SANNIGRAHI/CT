package core_java;
import java.util.Scanner;
public class Assignment20_Scanner_Method_XylemOrPhloem {
	    static void checkNumber(int num) {
	        int temp = num;

	        int lastDigit = temp % 10;
	        int meanSum = 0;

	        temp = temp / 10;

	        while (temp > 9) {
	            meanSum += temp % 10;
	            temp = temp / 10;
	        }

	        int firstDigit = temp;
	        int extremeSum = firstDigit + lastDigit;

	        if (extremeSum == meanSum) {
	            System.out.println(num + " is a Xylem number");
	        } else {
	            System.out.println(num + " is a Phloem number");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        checkNumber(number);
	        sc.close();
	    }

}
