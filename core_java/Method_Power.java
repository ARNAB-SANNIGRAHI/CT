package core_java;

public class Method_Power {
	public static int pow(int b, int p) {
		int pow=1;
		while(p>0) {
			pow=pow*b;
			p--;
		}
		return pow;
	}
public static void main(String[] args) {
	System.out.println(pow(2,4));
}
}
