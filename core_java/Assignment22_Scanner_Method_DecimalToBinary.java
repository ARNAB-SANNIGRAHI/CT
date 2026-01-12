package core_java;

import java.util.Scanner;

public class Assignment22_Scanner_Method_DecimalToBinary {
	public static void DtoB(int num) {
		int binary = 0;
		int place = 1;
		while (num > 0) {
			int rem = num % 2;
			binary = binary + rem * place;
			place = place * 10;
			num = num / 2;
		}
		System.out.println("Binary Value = " + binary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal value: ");
		int n = sc.nextInt();
		DtoB(n);
		sc.close();
	}
}
