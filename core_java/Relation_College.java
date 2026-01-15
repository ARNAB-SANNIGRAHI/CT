package core_java;

public class Relation_College {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Relation_Student getStudent() {
	return student;
}
public void setStudent(Relation_Student student) {
	this.student = student;
}
public Relation_Trainer getTrainer() {
	return trainer;
}
public void setTrainer(Relation_Trainer trainer) {
	this.trainer = trainer;
}
private String location;
private Relation_Student student;
private Relation_Trainer trainer;
}
