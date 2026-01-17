package abstraction;

public class CalciChild1 extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int multi(int a, int b) {
		return a*b;
	}
	
	public void m1() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		Calculator c = new CalciChild1();
		System.out.println(c.add(5, 5));
		System.out.println(c.multi(5, 5));
		System.out.println(c.sub(5, 5));
		//c.m1(); --> can't be accessed as it is overridden so it will give Compile TIme Error
	}

}
