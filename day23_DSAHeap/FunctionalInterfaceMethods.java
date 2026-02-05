package day23_DSAHeap;

public class FunctionalInterfaceMethods {
	public static void main(String[] args) {

	}
}

@java.lang.FunctionalInterface
interface FunctionalInterface {

	void add();// ->abstract method
	
	boolean equals(Object o);
	
	int hashCode();
	
	String toString();

	public static void sub() {// ->static method

	}

	private void some() {

	}

	default void method() {
		some();
	}

}
