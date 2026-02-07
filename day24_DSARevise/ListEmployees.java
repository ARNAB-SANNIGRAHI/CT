package day24_DSARevise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEmployees {
	public static void main(String[] args) {
		List<List<String>> data = new ArrayList<>();

		data.add(List.of("201", "Zayan", "zayan@gmail.com", "4", "1997-11-23", "09:40", "9876543210"));
		data.add(List.of("202", "Meera", "meera@gmail.com", "2", "2001-06-14", "07:20", "9123456789"));
		data.add(List.of("203", "Arjun", "arjun@gmail.com", "6", "1995-03-02", "10:05", "9988776655"));
		data.add(List.of("204", "Kavya", "kavya@gmail.com", "3", "1997-11-23", "06:50", "8899001122"));
		data.add(List.of("205", "Ishaan", "ishaan@gmail.com", "5", "1999-09-18", "08:30", "9001122334"));
		data.add(List.of("206", "Ritika", "ritika@gmail.com", "1", "2001-06-14", "09:10", "9011223344"));

		getSortedList(data).forEach(employee -> System.out.println(employee));

	}

	public static List<List<String>> getSortedList(List<List<String>> employees) {
		Comparator<List<String>> dateComparator = (List<String> e1, List<String> e2) -> {
			LocalDate localDate1 = LocalDate.parse(e1.get(4));
			LocalDate localDate2 = LocalDate.parse(e2.get(4));

			return localDate1.compareTo(localDate2);

		};
		Comparator<List<String>> timeComparator = (List<String> e1, List<String> e2) -> {
			LocalTime localTime1 = LocalTime.parse(e1.get(5));
			LocalTime localTime2 = LocalTime.parse(e2.get(5));

			return localTime1.compareTo(localTime2);
		};

		employees.sort(dateComparator.thenComparing(timeComparator));
		return employees;
	}
}
