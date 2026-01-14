package core_java;

class Animal {
    String name;
    String color;
    int no_of_legs;

    Animal(String name, String color, int no_of_legs) {
        this.name = name;
        this.color = color;
        this.no_of_legs = no_of_legs;
    }

    public void printAnimal() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(no_of_legs);
    }
}

public class Inheritance_Dog extends Animal {

    Inheritance_Dog(String name, String color, int no_of_legs) {
        super(name, color, no_of_legs);
    }

    public static void main(String[] args) {
        Inheritance_Dog d = new Inheritance_Dog("Dog", "Black", 4);
        d.printAnimal();
    }
}
