package core_java;
import java.util.Scanner;
public class Assignment18_Scanner_Method_HappyNumber {
	    private static int getNext(int n) {
	        int sum = 0;
	        while (n > 0) {
	            int digit = n % 10;
	            sum += digit * digit;
	            n /= 10;
	        }
	        return sum;
	    }
	    public static boolean isHappy(int n) {
	        int slow = n;
	        int fast = getNext(n);
	        while (fast != 1 && slow != fast) {
	            slow = getNext(slow);
	            fast = getNext(getNext(fast));
	        }
	        return fast == 1;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (isHappy(number)) {
	            System.out.println(number + " is a Happy Number");
	        } else {
	            System.out.println(number + " is not a Happy Number");
	        }
	        sc.close();
}
}
