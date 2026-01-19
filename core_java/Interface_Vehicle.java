package core_java;

public interface Interface_Vehicle {
void price();
void type();
}
class Bike5 implements Interface_Vehicle{

	@Override
	public void price() {
		System.out.println(30000.00);
	}

	@Override
	public void type() {
		System.out.println("Petrol");
		
	}
}
class Car5 implements Interface_Vehicle{

	@Override
	public void price() {
		System.out.println(2000000);
		
	}

	@Override
	public void type() {
		System.out.println("Electric");
		
	}
	
}