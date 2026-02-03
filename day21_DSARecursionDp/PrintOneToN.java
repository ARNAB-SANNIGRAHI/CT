package day21_DSARecursionDp;

public class PrintOneToN {
public static void main(String[] args) {
	printNumbers(9);
}
public static void printNumbers(int n) {
	if(n==0) {
		return;
	}
	System.out.println(n);//prints n to 1
	printNumbers(n-1);
	System.out.println(n);// prints 1 to n

	
}
}
