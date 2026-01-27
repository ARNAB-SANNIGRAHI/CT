package day15_SetInterface;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Employee_Id{
    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee(1, "Rahul", 450000));
        emp.add(new Employee(3, "Anita", 600000));
        emp.add(new Employee(5, "Vikram", 750000));
        emp.add(new Employee(2, "Neha", 300000));
        emp.add(new Employee(4, "Suresh", 900000));
        
        System.out.println("---List with id in ascending order---");
        Collections.sort(emp, (e1,e2)->e1.id-e2.id);//id ascending order
        System.out.println(emp);
        
        System.out.println("---List with id in descending order---");
        Collections.sort(emp, (e1,e2)->e2.id-e1.id);//id descending order
        System.out.println(emp);
        
        System.out.println("---List with name in alphabetical order---");
        Collections.sort(emp, (e1,e2)->e1.name.compareTo(e2.name));//name alphabetical order
        System.out.println(emp);
    }
}