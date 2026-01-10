package core_java;

import java.util.Scanner;

public class Scanner_Datatype {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine(); 

        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Married (true/false): ");
        boolean isMarried = sc.nextBoolean();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();            

        System.out.print("Enter Weight (kg): ");
        float weight = sc.nextFloat();    

        System.out.print("Enter Height (cm): ");
        double height = sc.nextDouble();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + isMarried);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");

        sc.close();
    }
}
