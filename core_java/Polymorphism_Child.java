package core_java;

public class Polymorphism_Child extends Polymorphism_Parent {
	//@override
	public void home() {
		System.out.println("Red");
	}
	public void bike() {
		System.out.println("BMW");
	}
	public static void home2() {
		System.out.println("Child Static method");
		}
	public static void main(String[] args) {
		Polymorphism_Parent p = new Polymorphism_Child();
		p.home();
		//p.bike();
		p.home2();
		Polymorphism_Child c = new Polymorphism_Child();
		c.home();
		c.bike();
		c.home2();
	}
}
