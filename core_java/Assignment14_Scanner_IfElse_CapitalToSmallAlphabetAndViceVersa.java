package core_java;
import java.util.Scanner;
public class Assignment14_Scanner_IfElse_CapitalToSmallAlphabetAndViceVersa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an alphabet: ");
	char c = sc.next().charAt(0);
	if(c>='A' && c<='Z') {
		c = (char)(c+32);
		System.out.println("Converted alphabet is: "+c);
	}else if(c>='a' && c<='z') {
		c = (char)(c-32);
		System.out.println("Converted alphabet is: "+c);
	} else {
		System.out.println("Not a valid alphabet");
	}
	sc.close();
}
}
