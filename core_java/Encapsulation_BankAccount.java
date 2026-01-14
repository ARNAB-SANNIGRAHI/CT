package core_java;

import java.util.Scanner;

public class Encapsulation_BankAccount {

    private int id;
    private double balance;
    private int password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance must be greater than 0.");
        }
    }

    public double getBalance(int password) {
        if (this.password == password) {
            return balance;
        } else {
            System.out.println("Incorrect password");
            return 0;
        }
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Encapsulation_BankAccount account = new Encapsulation_BankAccount();

        account.setId(101);
        account.setPassword(1234);
        account.setBalance(5000);

        System.out.print("Enter password to view balance: ");
        int enteredPassword = sc.nextInt();

        double bal = account.getBalance(enteredPassword);

        if (bal > 0) {
            System.out.println("Your Bank Balance is: " + bal);
        }

        sc.close();
    }
}
