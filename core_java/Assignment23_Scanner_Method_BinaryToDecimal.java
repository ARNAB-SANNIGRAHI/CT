package core_java;

import java.util.Scanner;

public class Assignment23_Scanner_Method_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary number: ");
        int binary = sc.nextInt();

        int temp = binary;
        int decimal = 0;
        int pow = 1;
        boolean isBinary = true;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && digit != 1) {
                isBinary = false;
                break;
            }

            decimal = decimal + digit * pow;
            pow = pow * 2;
            temp = temp / 10;
        }

        if (isBinary) {
            System.out.println("Decimal value: " + decimal);
        } else {
            System.out.println("Invalid input! Please enter only 0 and 1.");
        }
        sc.close();
    }
}
