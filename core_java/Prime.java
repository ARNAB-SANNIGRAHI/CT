package core_java;

public class Prime {
public static void main(String[] args) {
	int n=5;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			System.out.println("Not a prime number");
			return;
		}
	}
	System.out.println("Prime number");
}
}
