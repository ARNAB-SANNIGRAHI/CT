package core_java;

public class Assignment10_NumberOfEvenAndOddDigits {
public static void main(String[] args) {
	int num=12345666;
	int evendigits=0;
	int odddigits=0;
	while(num>0) {
		int digit = num%10;
		if(digit%2==0) {
			evendigits++;
		} else {
			odddigits++;
		}
		num=num/10;
	}
	System.out.println("Number of even digits: "+evendigits);
	System.out.println("Number of odd digits: "+odddigits);
}
}
