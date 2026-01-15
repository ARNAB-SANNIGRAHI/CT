package core_java;

public class Relation_CollegeTrainerStudentDriver {
	public static void main(String[] args) {

		Relation_Student s = new Relation_Student();
		s.setId(001);
		s.setName("XYZ");
		
		Relation_Trainer t = new Relation_Trainer();
		t.setName("ABC");
		t.setSubject("java");
		t.setStudent(s);
		
		Relation_College c =new Relation_College();
		c.setName("IEM");
		c.setLocation("kolkata");
		c.setTrainer(t);
		c.setStudent(s);
		
		System.out.println("----------College---------");
		System.out.println(c.getName());
		System.out.println(c.getLocation());
		Relation_Trainer t1 = c.getTrainer();
		Relation_Student s1 = c.getStudent();
		System.out.println("----------Trainer----------");
		System.out.println(t1.getName());
		System.out.println(t1.getSubject());
		Relation_Student s2 = t.getStudent();
		System.out.println("-------Student-------");
		System.out.println(s1.getId());
		System.out.println(s2.getName());

	}
}
