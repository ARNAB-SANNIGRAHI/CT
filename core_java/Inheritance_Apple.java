package core_java;

class Fruit {
	String color;
	String name;
	public Fruit() {
		
	}
	public Fruit(String color, String name) {
		this.color=color;
		this.name=name;
	}
}
public class Inheritance_Apple extends Fruit{
	double price;
	
	public Inheritance_Apple(String color, String name, double price) {
		this.color=color;
		this.name=name;
		this.price=price;
	}
	public static void main(String[] args) {
		Inheritance_Apple a = new Inheritance_Apple("Red","Kashmiri",230);
		System.out.println(a.color);
		System.out.println(a.name);
		System.out.println(a.price);
		Fruit f = new Fruit("Green", "Indian");
		System.out.println(f.name);
		System.out.println(f.color);
		
		
	}
}
