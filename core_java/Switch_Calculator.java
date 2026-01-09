package core_java;

public class Switch_Calculator {
public static void main(String[] args) {
	int a=50, b=10;
	switch('/') {
	case '+':
		System.out.println(a+b);
		break;
	case '-':
		System.out.println(a-b);
		break;
	case '*':
		System.out.println(a*b);
		break;
	case'/':
		System.out.println(a/b);
		break;
	default:
		System.out.println("No match");
}
}
}