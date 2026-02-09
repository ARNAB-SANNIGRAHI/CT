package day25_DSALambdaExpression;

abstract class Parent {
	public abstract void function(Number number);

	public abstract void function(Integer number);
}

class Child extends Parent {
	public void function(Number number) {
		System.out.println("Number: " + number);
	}

	public void function(Integer number) {
		System.out.println("Integer: " + number);
	}
}

public class WrapperClass {
	public static void main(String[] args) {
		Parent parent = new Child();

		parent.function(4);
		parent.function(4.8);
	}
}