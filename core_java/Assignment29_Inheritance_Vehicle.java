package core_java;

class Vehicle1 {
    String color;

    Vehicle1() {
    }

    public void printVehicle() {
        System.out.println("Vehicle Color: " + color);
    }
}

class Car extends Vehicle1 {
    String brand;
    double price;

    Car(String color, String brand, double price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public void printCar() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);
    }
}

class Bike extends Vehicle1 {
    String brand;
    double price;

    Bike(String color, String brand, double price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public void printBike() {
        System.out.println("Bike Color: " + color);
        System.out.println("Bike Brand: " + brand);
        System.out.println("Bike Price: " + price);
    }
}

public class Assignment29_Inheritance_Vehicle {

    public static void main(String[] args) {

        Vehicle1 v = new Vehicle1();
        v.color = "Red";
        v.printVehicle();

        System.out.println("------------------");

        Car c = new Car("Black", "BMW", 5000000);
        c.printCar();

        System.out.println("------------------");

        Bike b = new Bike("Blue", "Yamaha", 150000);
        b.printBike();
    }
}
