package core_java;

public class Child extends Parent {
	int b=20;
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		Parent p = new Parent();
		System.out.println(p.a);
		//System.out.println(p.b);
		p.m1();
	}
}
