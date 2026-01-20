package interface_codes;

public class Person2{
 private Brain brain;//strong
 private Car car;//weak
 public Person2() {
	 brain = new Brain();
 }
 public Brain getBrain() {
	 return brain;
 }
 public void setBrain(Brain brain) {
	 this.brain=brain;
 }
 public Car getCar() {
	 return car;
 }
 public void setCar(Car car) {
	 this.car = car;
 }
 public static void main(String[] args) {
	Person2 person = new Person2();
	person.brain.think();
	
	person.setCar(new Car()); 
	person.getCar().brand();
	
}
}
class Brain{
	public void think() {
	System.out.println("Brain is thinking");
	}
}
class Car{
	public void brand() {
		System.out.println("BMW");
		
	}
}