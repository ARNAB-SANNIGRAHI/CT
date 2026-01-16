package core_java;

public class Polymorphism_NonStatic {
	public void add(int a, int b) {
		System.out.println("2 int type");
		System.out.println(a+b);
	}
	public void add(int a, int b,int c) {
		System.out.println("3 int type");
		System.out.println(a+b+c);
	}
	public void add(float a, float b) {
		System.out.println("2 double type");
		System.out.println(a+b);
	}
	public void add(float a, float b, float c) {
		System.out.println("3 double type");
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Polymorphism_NonStatic pn=new Polymorphism_NonStatic(); 
		pn.add(1,2);
		pn.add(1,2,3);
		pn.add(1.2f, 1.7f);
		pn.add(1.2f,2.7f,5.3f);
	}
}
