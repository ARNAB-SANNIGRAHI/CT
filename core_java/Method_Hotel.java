package core_java;

public class Method_Hotel {
public static void main(String[] args) {
	System.out.println("Main Start");
	chef();
	server();
	manager();
	System.out.println("Main End");
}
public static void server(){
	System.out.println("Serving food");
}
public static void chef(){
	System.out.println("Preparing food");
}
public static void manager(){
	System.out.println("counting money");
}
}
