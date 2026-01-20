package day11_AM;

public class Driver_DBConnection {
	public static void main(String[] args) {
		DBConnection con1 = DBConnection.getDBConnection();
		DBConnection con2 = DBConnection.getDBConnection();
		DBConnection con3 = DBConnection.getDBConnection();
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}

}
