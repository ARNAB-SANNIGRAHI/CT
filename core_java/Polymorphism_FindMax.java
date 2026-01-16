package Polymorphism;

public class Polymorphism_FindMax {
	public int max(int a, int b) {
		if(a>b) {
			System.out.println(a);
		}else {
				System.out.println(b);
			}
		return 0;
	}
	public int max(int a, int b,int c) {
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>c) {
				System.out.println(b);
		}else {
					System.out.println(c);
			}
		return 0;
	}
	public float max(int a, float b) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		return 0.0f;
	}

	public static void main(String[] args) {
		Polymorphism_FindMax f= new Polymorphism_FindMax();
		f.max(1,2);
		f.max(43,65,34);
		f.max(43, 98.5f);
		
	}
}
