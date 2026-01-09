package core_java;

public class Assignment4_Conditional_Month {

	public static void main(String[] args) {
		int month = 5;
		String res = (month>=1 && month<=12) ? "Valid month" : "Not a valid month";
		System.out.println(res);
	}

}
