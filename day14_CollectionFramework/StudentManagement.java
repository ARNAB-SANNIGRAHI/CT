package day14_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 78));
        students.add(new Student(2, "Anish", 35));
        students.add(new Student(3, "Vikram", 92));
        students.add(new Student(4, "Aniket", 40));
        students.add(new Student(5, "Suresh", 28));

        System.out.println("All Students:");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\nPassed Students:");
        for (Student s : students) {
            if (s.marks >= 40) {
                s.display();
            }
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }
        System.out.println("\nTopper:");
        topper.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Student found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }


        int passed = 0, failed = 0;
        for (Student s : students) {
            if (s.marks >= 40) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("\nPassed students count: " + passed);
        System.out.println("Failed students count: " + failed);

        sc.close();
    }
}
