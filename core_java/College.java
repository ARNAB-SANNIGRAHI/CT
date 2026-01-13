package core_java;

public class College {
	int id;
	String name;
	String location;

public void exam() {
	System.out.println(name+" is taking exam");
	}
public void printCollege() {
	System.out.println("College name is "+name);
}
	public static void main(String[] args) {
		College e1=new College();
		College e2=new College();
		e1.id=101;
		e1.name="IEM";
		e1.location="Kolkata";
		e1.exam();
		e1.printCollege();
		e2.id=102;
		e2.name="UEM";
		e2.location="Kolkata";
		e2.exam();
		e2.printCollege();
	}
}

