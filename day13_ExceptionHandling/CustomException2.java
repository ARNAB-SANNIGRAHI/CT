package day13_ExceptionHandling;

public class CustomException2 extends RuntimeException {

	public CustomException2(String message) {
		super(message);
	}

	public static void main(String[] args) {
		int checkid = 70;
		int[] id = { 10, 20, 30, 50, 45, 98 };
		boolean found = false;
		for (int i = 0; i < id.length; i++) {
			if (id[i] == checkid) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Id is valid");
		} else {
			throw new CustomException2(checkid + " is invalid");
		}
	}

}
