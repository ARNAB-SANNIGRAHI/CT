package core_java;

public class Helper_UC_DC_Vehicle {
	public static void main(String[] args) {
		Bike2 b = new Bike2();
		b.topSpeed();
		System.out.println(b instanceof Vehicle3);
		System.out.println(b instanceof Bike2);
		Vehicle3 v = new Vehicle3(); 
		System.out.println(v instanceof Bike2);
		Vehicle3 v2 = new Bike2();
		System.out.println(v2 instanceof Bike2);
		System.out.println(v2 instanceof Car2);
	}
	public static void getVehicle(Vehicle3 v) {
		if(v instanceof Car2) {
		Car2 c = (Car2)v;
		c.noOfPass();
		} else if(v instanceof Bike2) {
			Bike2 b=(Bike2)v;
			b.topSpeed();
			
		}
	}	
}
