package day13_ExceptionHandling;

public class CheckAge {
	public static void main(String[] args) {
		int age = 10;
		checkage(age);
		try {
			int age2=-5;
			checkage(age2);
		}catch(CustomException1 e) {
			System.out.println("Customexception handled");
		}
	}
public static void checkage(int age) {
	if(age>0) {
		System.out.println("Age is valid");
	}else {
		throw new CustomException1(age+" is invalid");
	}
}
}
