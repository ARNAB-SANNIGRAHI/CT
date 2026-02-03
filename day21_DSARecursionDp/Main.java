package day21_DSARecursionDp;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	Student[] students = {
			new Student(1,"ABC","abc@gmail.com","Male",LocalDate.of(2003, Month.DECEMBER, 23)),
			new Student(2,"XYZ","xyz@gmail.com","Male",LocalDate.of(2004,Month.MARCH,24)),
			new Student(3,"MNO","mno@gmail.com","Male",LocalDate.of(2003,Month.MAY,28)),
			new Student(5,"PQR","pqr@gmail.com","Male",LocalDate.of(2005,Month.APRIL,21)),
			new Student(4,"CDE","cde@gmail.com","Male",LocalDate.of(2007,Month.JANUARY,16))
	};
	
	for(Student student: students) {
		System.out.println(student);
	}
	System.out.println("=========================================");
	
	NameComparator nameComparator = new NameComparator();
	Arrays.sort(students, nameComparator);
	for(Student student: students) {
		System.out.println(student);
	}
}
}
