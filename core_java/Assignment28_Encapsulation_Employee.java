package core_java;

import java.util.Scanner;

public class Assignment28_Encapsulation_Employee {

    private int empId;
    private double salary;
    private int pin;

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean verifyEmpId(int empId) {
        if (this.empId == empId) {
            return true;
        } else {
            System.out.println("Invalid Employee ID");
            return false;
        }
    }

    public double verifyPinAndGetSalary(int pin) {
        if (this.pin == pin) {
            return salary;
        } else {
            System.out.println("Incorrect PIN");
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Assignment28_Encapsulation_Employee e = new Assignment28_Encapsulation_Employee();
        e.setEmpId(1001);
        e.setPin(4321);
        e.setSalary(45000);

        System.out.print("Enter Employee ID: ");
        int enteredEmpId = sc.nextInt();

        if (e.verifyEmpId(enteredEmpId)) {

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            double sal = e.verifyPinAndGetSalary(enteredPin);
            if (sal > 0) {
                System.out.println("Employee Salary: " + sal);
            }
        }

        sc.close();
    }
}
