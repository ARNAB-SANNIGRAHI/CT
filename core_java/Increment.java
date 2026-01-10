package core_java;

public class Increment {
   public static void main(String[] args) {
	   int a=5, b=10;
	   a+=2;
	   b/=2;
	   a=a++ + --a + --a + b++ + b--;
	   b = b++ + a-- + a++ + ++b;
	   System.out.println(a);
	   System.out.println(b);
   }
}
