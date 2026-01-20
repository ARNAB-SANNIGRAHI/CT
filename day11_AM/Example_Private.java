package day11_AM;

public class Example_Private {
private static String a= "Private Variable";

private static void m1() {
	System.out.println("Private method");
}
private Example_Private() {
	System.out.println("Private constructor");
}
public static void main(String[] args) {
	System.out.println(a);
	m1();
	Example_Private e = new Example_Private();
	System.out.println(e);
	
}
}
