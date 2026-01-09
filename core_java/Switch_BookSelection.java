package core_java;

public class Switch_BookSelection {

	public static void main(String[] args) {
		switch("Sunday"){
			case "Monday", "Thursday", "Wednesday" :
				System.out.println("Bring English book");
			break;
			case "Tuesday", "Saturday" :
				System.out.println("Bring Java book");
			break;
			case "Friday" :
				System.out.println("Bring SQL book");
			break;
			case "Sunday" :
				System.out.println("Enjoy!");
			break;
			default :
				System.out.println("Not a valid day");
		}
	}

}
