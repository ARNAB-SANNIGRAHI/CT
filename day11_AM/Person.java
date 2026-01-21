package day11_AM;
import java.util.Objects;

public class Person {
	String name;
	int id;
	Person(int id, String name){
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object o) {
		//address same
		if(this == o) {
			return true;
		}
		//null object or same class
		if(o==null || o.getClass() != this.getClass())
			return false;
		Person p = (Person)o;//DC
		//states of an object
		if(this.id==p.id && this.name==p.name) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		 //java.util.Objects is utility class
		return Objects.hash(id, name);
	}
	@Override
	public String toString() {
		return "id:"+id+" name:"+name;
	}
	public static void main(String[] args) {
		
	Person p1 = new Person(10,"XYZ");
	Person p2 = new Person(11,"ABC");
	Person p3 = p1;
	Person p4 = null;
	
	System.out.println("---toString()---");
	System.out.println(p1);
	System.out.println(p2);
	//System.out.println(p1.toString());  // ->This and the previous line is same
	
	System.out.println("---hashCode()---");
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	System.out.println(p3.hashCode());
	
	System.out.println("---equals()---");
	System.out.println(p1.equals(p2));
	System.out.println(p1.equals(p3));
	System.out.println(p1.equals(p4));  // ->null pointer Exception
	
	System.out.println("---getClass()---");
	System.out.println(p1.getClass());  // ->The output type of this is called fully qualified classname
	System.out.println(p2.getClass());
	
	System.out.println("---comparing with another class---");
	Teacher t1 = new Teacher(10,"XYZ");
	System.out.println(p1.equals(t1));
	System.out.println(p3.equals(t1));
	System.out.println("---Compare address of two objects---");
	System.out.println(p1==p2);// It compares address of objects
	System.out.println(p1==p3);
	
	
}
}
