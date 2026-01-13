package core_java;

public class Constructor_Chaining {
	public Constructor_Chaining() {
		System.out.println("C1");
	}

	public Constructor_Chaining(int a) {
		this();
		System.out.println("C2");
	}

	public static void main(String[] args) {
		Constructor_Chaining c = new Constructor_Chaining(2);
	}
}
