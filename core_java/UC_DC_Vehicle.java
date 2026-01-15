package core_java;


	class Vehicle3 {
	    void travel() {
	        System.out.println("You can travel usint vehicle");
	    }
	}

	class Car2 extends Vehicle3 {
	    void noOfPass() {
	        System.out.println("No of passenger is 4");
	    }
	}

	class Bike2 extends Vehicle3 {
	    void topSpeed() {
	        System.out.println("Top speed is:100km/h");
	    }
	}
	
	class Train extends Vehicle3 {
	    void ticketPrice() {
	        System.out.println("Ticket price is 30/-");
	    }
	}

	public class UC_DC_Vehicle {
	    public static void main(String[] args) {
	        Bike2 b= new Bike2();
	        b.topSpeed();
	        System.out.println("--------------");
	        Car2 c = new Car2();
	        c.noOfPass();
	        Train t = new Train();
	        t.ticketPrice();
	        System.out.println("--------------");
	        Vehicle3 v= new Vehicle3();
	        v.travel();
	        Vehicle3 v1 = new Car2();//UC car
	        v1.travel();
	        v=new Bike2();//UC Bike
	        Bike2 b1 = (Bike2)v;//DC
	        b1.travel();
	        b1.topSpeed();
	    }
	}


