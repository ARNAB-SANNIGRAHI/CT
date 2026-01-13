package core_java;

public class Laptop {
    String brand;
    int price;
    Laptop() {
        this("Unknown", 0);
    }
    Laptop(String brand, int price) {
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

        Laptop laptop1 = new Laptop("Dell", 60000);
        Laptop laptop2 = new Laptop("HP", 55000);
        laptop1.comparePrice(laptop2);
    }
}
