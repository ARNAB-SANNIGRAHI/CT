package day22_DSAHashing;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
public static void main(String[] args) {
	HashSet<Employee> employees = new HashSet<>();
	
	employees.add(new Employee(1, "Mark","Male", LocalDate.of(1990, Month.DECEMBER, 25),3,"mark@gmail.com",123456789));
	employees.add(new Employee(2, "Steve","Male", LocalDate.of(2001, Month.DECEMBER, 25),4,"steve@gmail.com",123456789));
	employees.add(new Employee(3, "Tony","Male", LocalDate.of(1945, Month.DECEMBER, 25),7,"tony@gmail.com",123456789));
	employees.add(new Employee(4, "Jony","Male", LocalDate.of(1975, Month.DECEMBER, 25),10,"jony@gmail.com",123456789));
	employees.add(new Employee(5, "Elon","Male", LocalDate.of(1947, Month.DECEMBER, 25),2,"elon@gmail.com",123456789));
	employees.add(new Employee(6, "Ryan","Male", LocalDate.of(2000, Month.DECEMBER, 25),1,"ryan@gmail.com",123456789));
	employees.add(new Employee(7, "James","Male", LocalDate.of(2011, Month.DECEMBER, 25),1,"james@gmail.com",123456789));
	employees.add(new Employee(6, "Ryan","Male", LocalDate.of(2000, Month.DECEMBER, 25),1,"ryan@gmail.com",123456789));
	
	System.out.println(employees);
	
	System.out.println("====================================================================================================");
	
	for(Employee employee: employees) {
		System.out.println(employee);
	}
	
	System.out.println("====================================================================================================");
	
	Iterator<Employee> iterator = employees.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
