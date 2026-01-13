package core_java;

public class Constructor_Chaining2 {
	int id;
	String name;
	int price;
	int rating;
	public Constructor_Chaining2(){
		System.out.println("Constructor");
	}
	public Constructor_Chaining2(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Constructor_Chaining2(int id, String name, int price) {
		this(id,name);
		this.price=price;
		
	}
	public Constructor_Chaining2(int id, String name, int price, int rating) {
		this(id, name, price);
		this.rating=rating;
		
	}
	public void display() {
		System.out.println(id+" "+name+" "+price+" "+rating);
	}
public static void main(String[] args) {
	Constructor_Chaining2 c1 =new Constructor_Chaining2(001,"phone",300,4);
	c1.display();
	Constructor_Chaining2 c2 =new Constructor_Chaining2(002,"tablet",200,4);
	c2.display();
	Constructor_Chaining2 c3 =new Constructor_Chaining2(003,"laptop",600,4);
	c3.display();
	Constructor_Chaining2 c4 =new Constructor_Chaining2(004,"phone",900,4);
	c4.display();
	//Constructor c2=new Constructor(10,"cons");
	//c2.display();
}
}
