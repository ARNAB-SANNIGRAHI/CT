package core_java;

public class Interface_Cat implements Interface_Animal{
	@Override
	public void sound() {
	System.out.println("Meow");	
	}
	@Override
	public void colour() {
		System.out.println("White");
	}
}
