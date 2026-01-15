package core_java;

public class Relation_Trainer {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Relation_Student getStudent() {
		return student;
	}
	public void setStudent(Relation_Student student) {
		this.student = student;
	}
	private String name;
	private String subject;
	private Relation_Student student;
}
