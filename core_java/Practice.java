package core_java;

public class Practice {
int a1;
static int a2;
Student s1;
static Student s2;
public Practice() {
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(this.a1);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(this.s1);
}
public void m1() {
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(this.a1);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s2);
}
public static void m2() {
	Practice p = new Practice();
	System.out.println(p.a1);
	System.out.println(a2);
	System.out.println(p.s1);
	System.out.println(s2);
	System.out.println();
}
public static void main(String[] args) {
	Practice p = new Practice();
	p.m1();
	m2();
	Practice p2;
	p2=new Practice();
	p2.m1();
	m2();
}
}
