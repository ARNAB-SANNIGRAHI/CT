package core_java;
import java.util.Scanner;
public class Assignment16_Scanner_Method_EvenOddCount {
	public static boolean isEvenOddCountEqual(int num) {
		int evenCount=0;
		int oddCount=0;
		while(num>0) {
			int digit = num%10;
			if(digit%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num=num/10;
		}
		return evenCount==oddCount;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	if(isEvenOddCountEqual(num)) {
		System.out.println("True");
	} else {
		System.out.println("False");
		sc.close();
	}
}
}
