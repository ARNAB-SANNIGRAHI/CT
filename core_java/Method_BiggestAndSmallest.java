package core_java;

public class Method_BiggestAndSmallest {
	public static void big(int a, int b, int c) {
		int res = (a>b && a>c)?a:(b>c)?b:c;
		System.out.println("Biggest number is: "+res);
	}
	public static void small(int a, int b, int c) {
		int res = (a<b && a<c)?a:(b<c)?b:c;
		System.out.println("Smallest number is: "+res);
	}
public static void main(String[] args) {
	big(198, 43, 98);
	small(123,43,54);
}
}
