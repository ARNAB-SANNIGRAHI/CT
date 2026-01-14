package core_java;

public class Laptop {
    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    void comparePrice(Laptop other) {
        if (this.price > other.price) {
            System.out.println(this.brand + " is costly");
        } else if (this.price < other.price) {
            System.out.println(other.brand + " is costly");
        } else {
            System.out.println("Both laptops have the same price");
        }
    }
    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell", 60000);
        Laptop l2 = new Laptop("HP", 55000);
        l1.comparePrice(l2);
    }
}
