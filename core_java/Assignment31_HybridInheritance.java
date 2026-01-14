package core_java;

	class Vehicle2 {
	    void start() {
	        System.out.println("Vehicle is starting");
	    }
	}

	class Car1 extends Vehicle2 {
	    void drive() {
	        System.out.println("Car is driving");
	    }
	}

	class Bike1 extends Vehicle2 {
	    void ride() {
	        System.out.println("Bike is riding");
	    }
	}

	class SportsCar1 extends Car1 {
	    void turbo() {
	        System.out.println("SportsCar turbo mode on");
	    }
	}

	public class Assignment31_HybridInheritance {//multilevel + hierarchical inheritance
	    public static void main(String[] args) {
	        SportsCar1 sc = new SportsCar1();
	        sc.start();
	        sc.drive();
	        sc.turbo();

	        Bike1 b = new Bike1();
	        b.start();
	        b.ride();
	    }
	}

