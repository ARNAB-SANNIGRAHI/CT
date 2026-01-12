package core_java;
import java.util.Scanner;
public class Assignment24_Scanner_Method_DecimalToOctal {
    static void convertToOctal(int decimal) {
        int octal = 0;
        int place = 1;
        while (decimal > 0) {
            int rem = decimal % 8;
            octal = octal + rem * place;
            place = place * 10;
            decimal = decimal / 8;
        }
        System.out.println("Octal value: " + octal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        convertToOctal(decimal);
        sc.close();
    }
}
