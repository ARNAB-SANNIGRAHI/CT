package core_java;

public class IfElse_BiggestofThree {
	public static void main(String[] args) {
		int a=50,b=40,c=30;
		if(a>b && a>c) {
			System.out.println(a);
		}
		else {
			if(b>c)
			System.out.println(b);
			else {
				System.out.println(c);
			}
		}
		
	}
}
