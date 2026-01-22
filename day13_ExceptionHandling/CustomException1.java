package day13_ExceptionHandling;

public class CustomException1 extends RuntimeException {
	
		public CustomException1(String message) {
			super(message);
		}
		public static void main(String[] args) {
			int age =-10;
			
			if(age>0) {
				System.out.println("Age is valid");
			}else {
				throw new CustomException1(age+" is invalid");
			}
		}
}
