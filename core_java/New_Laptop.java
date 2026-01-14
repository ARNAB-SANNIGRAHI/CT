package core_java;

public class New_Laptop {
    String brand;
    double price;

    public New_Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    void comparePrice(New_Laptop other) {
        if (this.price > other.price) {
            System.out.println(this.brand + " is costly");
        } else if (this.price < other.price) {
            System.out.println(other.brand + " is costly");
        } else {
            System.out.println("Both laptops have the same price");
        }
    }
    public static void main(String[] args) {

        New_Laptop l1 = HelpLaptop.getLaptop();
        l1.brand="Hp";
        l1.price=55000;
        
        New_Laptop l2 = HelpLaptop.getLaptop();
        l2.brand="Dell";
        l2.price=65000;
        l1.comparePrice(l2);
        New_Laptop l3 = HelpLaptop.VerifyPrice(500,"xyz");
        New_Laptop l4 = HelpLaptop.VerifyPrice(55000,"abc");
        System.out.println(l3);
        System.out.println(l4);;
    }
}

