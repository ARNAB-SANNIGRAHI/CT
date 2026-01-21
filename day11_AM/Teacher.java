package day11_AM;
import java.util.Objects;

public class Teacher {
	String name;
	int id;
	Teacher(int id, String name){
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o==null || o.getClass() != this.getClass())
			return false;
		Teacher t = (Teacher)o;
		if(this.id==t.id && this.name==t.name) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public String toString() {
		return "id:"+id+" name:"+name;
	}
	public static void main(String[] args) {
		
	Teacher t1 = new Teacher(10,"XYZ");
	Teacher t2 = new Teacher(11,"ABC");
	Teacher t3 = t1;
	Teacher t4 = null;
	
	System.out.println("---toString()---");
	System.out.println(t1.toString());
	System.out.println(t2.toString());
	
	System.out.println("---hashCode()---");
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	System.out.println(t3.hashCode());
	
	System.out.println("---equals()---");
	System.out.println(t1.equals(t2));
	System.out.println(t1.equals(t3));
	System.out.println(t1.equals(t4));
	
	System.out.println("---getClass()---");
	System.out.println(t1.getClass());
	
	System.out.println("---comparing with another class---");
	Person p = new Person(10,"XYZ");
	System.out.println(t1.equals(p));
	System.out.println(t2.equals(p));
	
}

}
