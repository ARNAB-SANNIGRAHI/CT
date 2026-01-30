package day18_DSAStack;

public class MethodCall {
public static void main(String[] args) {
	hi();
	hello();
	bye();
}

private static void bye() {
	// TODO Auto-generated method stub
	
}

private static void hello() {
	bye();
	
}

private static void hi() {
	hello();
	
}
}


/*
Execution order:

			bye
			hello
			hi
			main

*/