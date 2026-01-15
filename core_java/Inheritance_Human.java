package core_java;

class Human {
    String name;
    int age;
    char gender;
    
    Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}

class Employee2 extends Human {
    int id;
    double sal;

    Employee2(String name, int age, char gender, int id, double sal) {
        super(name, age, gender);
        this.id = id;
        this.sal = sal;
        System.out.println(id);
        System.out.println(sal);
    }
}

class Student2 extends Human {
    float percentage;

    Student2(String name, int age, char gender, float percentage) {
        super(name, age, gender);
        this.percentage = percentage;
        System.out.println(percentage);
    }
}

public class Inheritance_Human {
    public static void main(String[] args) {

        Employee2 e = new Employee2("xyz", 12, 'M', 1, 35000.00);
        System.out.println("------------------------");

        Student2 s = new Student2("abc", 20, 'F', 85);
    }
}
