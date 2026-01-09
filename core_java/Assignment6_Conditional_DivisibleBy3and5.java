package core_java;

public class Assignment6_Conditional_DivisibleBy3and5 {
public static void main(String[] args) {
	int num=45;
	String res=(num%3==0 && num%5==0) ? "Divisible by 3 and 5" : "Not divisible by 3 and 5";
	System.out.println(res);
}
}
