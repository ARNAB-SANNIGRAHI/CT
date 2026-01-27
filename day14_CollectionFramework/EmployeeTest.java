package day14_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;
    String dept;

    Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + dept;
    }
}

public class EmployeeTest {

    static ArrayList<Employee> findEmpByDep(ArrayList<Employee> employees, String dept) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (dept.equalsIgnoreCase(e.dept)) {
                result.add(e);
            }
        }
        return result;
    }

    static ArrayList<Employee> findEmpBySal(ArrayList<Employee> employees, double sal) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.salary > sal) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Rahul", 450000, "Development"));
        empList.add(new Employee(2, "Anita", 600000, "HR"));
        empList.add(new Employee(3, "Vikram", 750000, "Development"));
        empList.add(new Employee(4, "Neha", 300000, "Testing"));
        empList.add(new Employee(5, "Suresh", 900000, "Development"));

        System.out.println("Employees in Development Department:");
        ArrayList<Employee> devEmps = findEmpByDep(empList, "Development");
        for (Employee e : devEmps) {
            System.out.println(e);
        }

        System.out.println("\nEmployees with salary more than 500000:");
        ArrayList<Employee> highSalEmps = findEmpBySal(empList, 500000);
        for (Employee e : highSalEmps) {
            System.out.println(e);
        }
    }
}
