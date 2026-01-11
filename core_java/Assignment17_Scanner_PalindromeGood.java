package core_java;
import java.util.Scanner;
public class Assignment17_Scanner_PalindromeGood {
	public static boolean isPalindrome(int num) {
			int original=num;
			int reverse=0;
			if(num<0) {
				System.out.println("Negative numbers are not considered as palindrome");
				return false;
			}else {
					while(num>0) {
						int digit = num%10;
						reverse = reverse*10+digit;
						num=num/10;
					}
					return reverse==original;
	}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	if(isPalindrome(num)) {
		System.out.println("Good");
	} else {
		System.out.println("Bad");
	}
	sc.close();
}
}
