package abstraction;

public class Redmi3 extends Redmi2 {
public void smartCamera() {
	System.out.println("Smart Camera isadded");
}
public static void main(String[] args) {
	
	System.out.println("--- Redmi3 ---");
	Redmi3 r3 = new Redmi3();
	r3.camera();
	r3.battery();
	r3.smartCamera();
	
	System.out.println("--- Redmi2 ---");
	Redmi2 r2 = new Redmi3();
	r2.battery();
	r2.camera();
	r2.smartCamera();
	
	System.out.println("--- Redmi1 ---");
	Redmi1 r1 = new Redmi3();
	r1.battery();
	r1.camera();
	//r1.smartCamera();
	
	System.out.println("--- Mobile ---");
	Mobile m = new Redmi3();
	m.battery();
	m.camera();
	//m.smartCamera();
	
}
}
