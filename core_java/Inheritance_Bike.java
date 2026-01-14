package core_java;

class Vehicle {

    String brand;
    String color;
    double price;

    public void printVehicle() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
    }
}

public class Inheritance_Bike extends Vehicle {

    Inheritance_Bike(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        Inheritance_Bike b = new Inheritance_Bike("BMW", "Black", 150);
        b.printVehicle();
    }
}
