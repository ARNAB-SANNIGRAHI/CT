package core_java;

public class Relation_Person {
String name;
Relation_Pancard pancard;
public static void main(String[] args) {
	Relation_Person person=new Relation_Person();
	person.name="Dinga";
	Relation_Pancard card = new Relation_Pancard();
	card.panId="ABC123";
	card.dob="14/04/2004";
	
	person.pancard=card;
	
	System.out.println(person.name);;
	System.out.println(person.pancard.panId);
	System.out.println(person.pancard.dob);
}
}
