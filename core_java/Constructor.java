package core_java;

public class Constructor {
	int id;
	String name;
	public Constructor(){
		System.out.println("Constructor");
	}
	public Constructor(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
public static void main(String[] args) {
	Constructor c1 =new Constructor();
	c1.display();
	Constructor c2=new Constructor(10,"cons");
	c2.display();
}
}
