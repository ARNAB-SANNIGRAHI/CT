package core_java;

class Product {
    String brand;

    // Constructor
    Product(String brand) {
        this.brand = brand;
        System.out.println(brand);
    }
}

class Mobile extends Product {
    int price;
    String sim;

    // Constructor
    Mobile(String brand, int price, String sim) {
        super(brand);          // calls Product constructor
        this.price = price;
        this.sim = sim;
        System.out.println(price);
        System.out.println(sim);
    }
}

class Laptop1 extends Product {
    int price;

    Laptop1(String brand, int price) {
        super(brand);
        this.price = price;
        System.out.println(price);
    }
}

public class Inheritance_Product {
    public static void main(String[] args) {

        new Mobile("Samsung", 20000, "5G");
        System.out.println("--------------------");
        new Laptop1("Dell", 60000);
    }
}
