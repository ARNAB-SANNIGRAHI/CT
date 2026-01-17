package abstraction;

public abstract class Shape {
	public abstract void area();

	public void display() {
		System.out.println("Displaying shape area");
	}

	public static void main(String[] args) {
		Shape s;

		s = new Circle();
		s.display();
		s.area();

		System.out.println();

		s = new Rectangle();
		s.display();
		s.area();
	}
}

class Circle extends Shape {
	public void area() {
		System.out.println("This is the AREA of circle");
	}
}

class Rectangle extends Shape {
	public void area() {
		System.out.println("This is area of rectangle");
	}
}
