package core_java;

public class This {
int id=100;
String name;
public void initialize() {
}
public void m1() {
	int id = 200;
	System.out.println(id);//local
	System.out.println(this.id);//Non Static
}
public static void main(String[] args) {
	This t = new This();
	t.m1();
}
}
