package interface_codes;

public class Car1 {
 private Engine engine;//strong
 private Driver1 driver;//weak
 public Car1() {
	 engine = new Engine();
 }
 public Engine getEngine() {
	 return engine;
 }
 public void setEngine(Engine engine) {
	 this.engine=engine;
 }
 public Driver1 getDriver1() {
	 return driver;
 }
 public void setDriver1(Driver1 driver) {
	 this.driver = driver;
 }
 public static void main(String[] args) {
	Car1 car = new Car1();
	car.engine.work();
	
	car.setDriver1(new Driver1()); 
	car.getDriver1().attendance();
	
}
}
class Engine{
	public void work() {
	System.out.println("Engine is working");
	}
}
class Driver1{
	public void attendance() {
		System.out.println("Driver is present");
		
	}
}