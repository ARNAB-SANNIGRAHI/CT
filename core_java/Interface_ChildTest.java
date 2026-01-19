package core_java;

public class Interface_ChildTest implements Interface_Test {
	@Override
	public void m2() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {

		Interface_ChildTest t = new Interface_ChildTest();
		//t.m1(); Private method(So it will give CompileTime Error.)
		t.m2();
		Interface_Test.m3();
		System.out.println(Interface_Test.a);
	}
}