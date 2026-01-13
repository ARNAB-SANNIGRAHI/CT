package core_java;

public class This_Employee {
	int id;
	String name;
	String location;

public void init(int id, String name) {
	this.id=id;
	this.name=name;
	}
public void display() {
	System.out.println(id);
	System.out.println(name);
	System.out.println("---------------");
}
	public static void main(String[] args) {
		This_Employee e1=new This_Employee();
		e1.display();
		e1.init(10,"XYZ");
		e1.display();
	}
}
