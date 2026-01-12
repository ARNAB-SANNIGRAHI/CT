package core_java;
import java.util.Scanner;
public class Assignment26_Scanner_Method_CountBits {
    static void countBitsOne(int decimal) {
        int count = 0;
        int temp = decimal;
        while (temp > 0) {
            if (temp % 2 == 1) {
                count++;
            }
            temp = temp / 2;
        }
        System.out.println("Number of 1s in binary: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        countBitsOne(number);
        sc.close();
    }
}