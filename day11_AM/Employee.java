package day11_AM;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	Employee(int id, String name, double salary, String department){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "id:"+id+" name:"+name+" Salary:"+salary+" department:"+department;
	}
	public static void main(String[] args) {
		
	Employee e = new Employee(10,"XYZ", 30000.00,"IT");
	System.out.println(e);
	
	Employee[] employees = new Employee[3];
	
	employees[0] = e;
	employees[1] = new Employee(11,"ABC", 45000.00,"HR");
	employees[2] = new Employee(12,"MNO", 55000.00,"CEO");
	for(int i=0;i<employees.length;i++) {
		System.out.println(employees[i]);
	}
	}
}
