package Polymorphism;

public class Employee {
	int id;
	String name;
	double salary;
	String dep;
	public Employee(int id){
		this.id = id;
	}
	public Employee(int id, String name) {
		this(id);
		this.name=name;
	}
	public Employee(int id, String name, double salary) {
		this(id, name);
		this.salary=salary;
	}
	public Employee(int id, String name, double salary, String dep) {
		this(id, name, salary);
		this.dep=dep;
	}
	public void display() {
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
		System.out.println("Salary is:"+salary);
		System.out.println("Department is:"+dep);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2,"ABC");
		Employee e3 = new Employee(3,"Xyz", 35000.00);
		Employee e4 = new Employee(4,"MNO",40000.00,"IT");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
	}
}
