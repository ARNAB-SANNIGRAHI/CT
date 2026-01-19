package core_java;

public class Interface_Dog implements Interface_Animal {
	@Override
	public void sound() {
	System.out.println("Bark");	
	}
	@Override
	public void colour() {
		System.out.println("Black");
	}
	public static void main(String[] args) {
		System.out.println("---Animal---");
		Interface_Animal a1 = new Interface_Dog();  // UC
		a1.colour();
		a1.sound();
		System.out.println("---Dog---");
		Interface_Dog a2 = (Interface_Dog)a1;  // DC
		a2.sound();
		a2.colour();
	}
}
