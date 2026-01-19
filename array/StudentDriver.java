package array;

public class StudentDriver {
public static void main(String[] args) {
	Student[] students = new Student[3];
	students[0]=new Student(10, "Virat");
	students[1]=new Student(11, "Rohit");
	students[2]=new Student(12, "Dhoni");
	
	System.out.println(students[0]); // Address of student
	
	//Using for loop printing details
	for(int i=0;i<students.length;i++) {
		System.out.println(students[i].id);
		System.out.println(students[i].name);
	}	
	//Using for each loop printing details
		for(Student s: students) {
			System.out.println(s.id);
			System.out.println(s.name);
			}

}
}
