package day25_DSALambdaExpression;

public class Ambiguity {
public static void main(String[] args) {
	
}
}
interface A{
	default void add() {
		System.out.println("default a");
	}
}
interface B{
	default void add() {
		System.out.println("default b");
	}
}
class C implements A, B{
		@Override
		public void add() {
			System.out.println("default c");
		}
	}