package core_java;

public class Polymorphism {
public static void add(int a, int b) {
	System.out.println("2 int type");
	System.out.println(a+b);
}
public static void add(int a, int b,int c) {
	System.out.println("3 int type");
	System.out.println(a+b+c);
}
public static void add(float a, float b) {
	System.out.println("2 double type");
	System.out.println(a+b);
}
public static void add(float a, float b, float c) {
	System.out.println("3 double type");
	System.out.println(a+b+c);
}
public static double add(double a, double b, double c, double d) {
	System.out.println("4 double type");
	System.out.println(a+b+c+d);
	return 0.0f;
}
public static void main(String[] args) {
	add(1,2);
	add(1,2,3);
	add(1.2f, 1.7f);
	add(1.2f,2.7f,5.3f);
	add(2.1,2.2,3.4,5.4);
}
}
