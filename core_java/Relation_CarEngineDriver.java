package core_java;

public class Relation_CarEngineDriver {
public static void main(String[] args) {
	Relation_Engine e =new Relation_Engine();
	e.setCc(5000);
	e.setType("petrol");
	
	Relation_Car4 c = new Relation_Car4();
	c.setId(101);
	c.setColor("black");
	c.setBrand("BMW");
	c.setEngine(e);
	
	System.out.println("-------CAR-------");
	System.out.println(c.getId());
	System.out.println(c.getColor());
	System.out.println(c.getBrand());
	System.out.println("----------ENGINE----------");
	Relation_Engine e2 = c.getEngine();
	System.out.println(e2.getCc());
	System.out.println(e2.getType());
}
}
