package day25_DSALambdaExpression;

public class LambdaSample {
	static {
		System.out.println("LambdaSample static()");
	}
	{
		System.out.println("LambdaSample non static()");
	}

	public LambdaSample() {
		System.out.println("LambdaSample Constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");

		LambdaSample lambdaSample = new LambdaSampleChild();
	}

}

class LambdaSampleChild extends LambdaSample {
	{
		System.out.println("LambdaSampleChild non static()");
	}
	static {
		System.out.println("LambdaSampleChild static()");
	}

	public LambdaSampleChild() {
		System.out.println("LambdaSampleChild Constructor");
	}
}
