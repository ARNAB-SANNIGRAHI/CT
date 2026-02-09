package day25_DSALambdaExpression;

interface Parent1 {
void function(Number number);
}

public class Interface{
	public static void main(String[] args) {
		Parent1 parent = new Parent1(){
		public void function(Number number) {
			System.out.println("Number: "+number);
		}
	};

	parent.function(1234);
	
	Parent1 parent1 = (Number number) -> System.out.println("Number: "+number);// This is the lambda expression of the previous function
	
	parent1.function(4321);
}
}