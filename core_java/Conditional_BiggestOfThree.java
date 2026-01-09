package core_java;

public class Conditional_BiggestOfThree {
  public static void main(String[] args) {
	int a = 15;
	int b = 10;
	int c = 9;
			System.out.println(a>b && a>c ? a : (b > c) ? b : c);
}
}
