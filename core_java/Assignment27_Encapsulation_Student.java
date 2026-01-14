package core_java;

import java.util.Scanner;

public class Assignment27_Encapsulation_Student {

    private int rollNo;
    private String name;
    private double marks;

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public double getMarks(int rollNo) {
        if (this.rollNo == rollNo) {
            return marks;
        } else {
            System.out.println("Access Denied");
            return 0;
        }
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(int rollNo) {
        if (this.rollNo == rollNo) {
            return name;
        } else {
            return "Access Denied";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Assignment27_Encapsulation_Student s = new Assignment27_Encapsulation_Student();
        s.setRollNo(1);
        s.setName("Rahul");
        s.setMarks(85);

        System.out.print("Enter roll number to view name and marks: ");
        int r = sc.nextInt();

        if (s.getRollNo() == r) {
            System.out.println("Name: " + s.getName(r));
            System.out.println("Marks: " + s.getMarks(r));
        } else {
            System.out.println("Invalid Roll Number");
        }

        sc.close();
    }
}
