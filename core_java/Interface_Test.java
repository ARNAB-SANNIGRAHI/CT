package core_java;

interface Interface_Test {
	public static final int a = 10;
	int b = 20; // Both are same as public static final is default

	private void m1() {
		System.out.println("private method");
	}

	default void m2() {
		System.out.println("Default method");
		m1();
	}

	static void m3() {
		System.out.println("Static method");
	}
}
