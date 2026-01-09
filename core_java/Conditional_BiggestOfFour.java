package core_java;

public class Conditional_BiggestOfFour {
	public static void main(String[] args) {
    int a=10, b=15, c=20, d=50;
    int big=(a>b)?a:b;
    big=(big>c)?big:c;
    big=(big>d)?big:d;
    System.out.println("Biggest is "+big);
    }
}