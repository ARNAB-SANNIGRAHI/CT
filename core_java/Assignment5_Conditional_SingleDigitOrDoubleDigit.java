package core_java;

public class Assignment5_Conditional_SingleDigitOrDoubleDigit {
	public static void main(String[] args) {
     int num=-5;
     String res=(num>=-9 && num<=9) ? "Single digit number" : (num>=-99 && num <=99) ? "Double digit number" : "Neither single digit nor double digit number";
     System.out.println(res);
	}
}
