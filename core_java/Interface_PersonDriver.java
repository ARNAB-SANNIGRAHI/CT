package core_java;

public class Interface_PersonDriver {
public static void main(String[] args) {
	Interface_Person p = new Interface_Person();
	p.setV(new Car5());
	
	Interface_Vehicle v2 = p.getV();
	v2.type();
	v2.price();
	
	p.setV(new Bike5());
	
	Interface_Vehicle v3 = p.getV();
	v3.type();
	v3.price();
	//Different code for using helper class
	Interface_Vehicle v = Interface_HelpVehicle.getInterface_Vehicle();
	v.type();
	v.price();
}
}
