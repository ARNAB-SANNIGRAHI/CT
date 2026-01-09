package core_java;

public class If_BiggestOfFour {
	public static void main(String[] args) {
		int a=4,b=5,c=6,d=7;
		int big=a;
		if(b>big) {
			big=b;
		}
		if(c>big) {
			big=c;;
		}
		if(d>big) {
			big=d;
		}
		System.out.println(big);
	}
}
