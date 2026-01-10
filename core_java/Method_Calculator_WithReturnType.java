package core_java;

public class Method_Calculator_WithReturnType {
	public static int add(int a, int b) {
		int res=a+b;
		return res;
	}
	public static int sub(int a, int b) {
		int res=a-b;
		return res;
	}
	public static int mul(int a, int b) {
		int res=a*b;
		return res;
	}
	public static int div(int a, int b) {
		int res=a/b;
		return res;
	}
public static void main(String[] args) {
	int a=10, b=30;
	switch('+') {
	case '+' :
		System.out.println(add(a,b));
		break;
	case '-' :
		System.out.println(sub(a,b));
		break;
	case '*' :
		System.out.println(mul(a,b));
		break;
	case'/' :
		System.out.println(div(a,b));
	}
}
}
