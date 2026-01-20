package day11_AM;

public class DBConnection {
	private static DBConnection con;
	
	public static DBConnection getDBConnection() {
		if(con==null) {
			con = new DBConnection();
		}
		return con;
	}

	private DBConnection() {
		
	}
}
