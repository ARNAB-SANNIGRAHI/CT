package core_java;

public class Student {
	int id;
	String name;
	public void study(){
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);// address of s
		System.out.println(s.id);// 0
		System.out.println(s.name);// null
		s.id=101;
		s.name="xyz";
		System.out.println(s.id);// 101
		System.out.println(s.name);// "xyz"
		s.study();
		
	}
}
