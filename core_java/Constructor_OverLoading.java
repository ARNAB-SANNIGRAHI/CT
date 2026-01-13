package core_java;

public class Constructor_OverLoading {
	int id;
	String name;
	int price;
	int rating;
	public Constructor_OverLoading(){
		System.out.println("Constructor");
	}
	public Constructor_OverLoading(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Constructor_OverLoading(int id, String name, int price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	public Constructor_OverLoading(int id, String name, int price, int rating) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
		
	}
	public void display() {
		System.out.println(id+" "+name+" "+price+" "+rating);
	}
public static void main(String[] args) {
	Constructor_OverLoading c1 =new Constructor_OverLoading(001,"phone",300,4);
	c1.display();
	Constructor_OverLoading c2 =new Constructor_OverLoading(002,"tablet",200,4);
	c2.display();
	Constructor_OverLoading c3 =new Constructor_OverLoading(003,"laptop",600,4);
	c3.display();
	Constructor_OverLoading c4 =new Constructor_OverLoading(004,"phone",900,4);
	c4.display();
	//Constructor c2=new Constructor(10,"cons");
	//c2.display();
}
}
