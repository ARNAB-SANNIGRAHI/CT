package core_java;

public class Employee {
int id;
String name;
double salary;
public void work() {
	System.out.println(name+" is working");
}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="Raju";
		e1.salary=5.0;
		e1.work();
	}
}
