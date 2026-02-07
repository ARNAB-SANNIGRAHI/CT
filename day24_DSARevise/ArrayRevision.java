package day24_DSARevise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayRevision {
	public static void main(String[] args) {
		Employee[] employees = {
				new Employee(1, "Alice Johnson", "alice.johnson@example.com", 5, LocalDate.of(1995, 8, 12),
						LocalTime.of(10, 30), 9876543210L),

				new Employee(2, "Bob Smith", "bob.smith@example.com", 8, LocalDate.of(1990, 7, 25),
						LocalTime.of(14, 45), 9123456780L),

				new Employee(3, "Charlie Brown", "charlie.brown@example.com", 3, LocalDate.of(1998, 11, 5),
						LocalTime.of(9, 15), 9988776655L),

				new Employee(4, "Diana Prince", "diana.prince@example.com", 10, LocalDate.of(1988, 1, 18),
						LocalTime.of(6, 50), 9012345678L),

				new Employee(5, "Ethan Williams", "ethan.williams@example.com", 2, LocalDate.of(2000, 9, 30),
						LocalTime.of(16, 20), 9345678123L),
				new Employee(6, "Ethan Williams", "ethan.williams@example.com", 2, LocalDate.of(2000, 9, 30),
						LocalTime.of(11, 20), 9345678123L)

		};

		List<Employee> list = new ArrayList<>(Arrays.asList(employees));
		list.add(new Employee());

		System.out.println(Arrays.toString(employees));

		List<Employee> sortedEmployee = getSortedEmployee(employees);

		for (Employee employee : sortedEmployee) {
			System.out.println(employee);
		}

	}

	public static List<Employee> getSortedEmployee(Employee[] employees) {
		List<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));
		Comparator<Employee> dateOfBirth = (Employee e1, Employee e2) -> e1.getDateOfBirth()
				.compareTo(e2.getDateOfBirth());
		Comparator<Employee> timeOfBirth = (Employee e1, Employee e2) -> e1.getTimeOfBirth()
				.compareTo(e2.getTimeOfBirth());
		Collections.sort(employeeList, dateOfBirth.thenComparing(timeOfBirth)
				.thenComparing((o1, o2) -> o1.getExperience() - o2.getExperience()));
		return employeeList;
	}
}
