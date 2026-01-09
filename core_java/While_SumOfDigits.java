package core_java;

public class While_SumOfDigits {
public static void main(String[] args) {
	int n=123, sum=0;
	while(n!=0) {
		int r = n%10;
		n=n/10;
		sum=sum+r;
	}
	System.out.println("Sum of digits " +sum);
}
}
