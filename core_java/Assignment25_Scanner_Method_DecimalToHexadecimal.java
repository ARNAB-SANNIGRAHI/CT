package core_java;
import java.util.Scanner;
public class Assignment25_Scanner_Method_DecimalToHexadecimal {
    static void convertToHexadecimal(int decimal) {
        if (decimal == 0) {
            System.out.println("Hexadecimal value: 0");
            return;
        }
        char[] hex = new char[32];
        int index = 0;
        while (decimal > 0) {
            int rem = decimal % 16;
            if (rem < 10) {
                hex[index] = (char) (rem + 48);
            } else {
                hex[index] = (char) (rem + 55);
            }
            decimal = decimal / 16;
            index++;
        }
        System.out.print("Hexadecimal value: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hex[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        convertToHexadecimal(decimal);
        sc.close();
    }
}
