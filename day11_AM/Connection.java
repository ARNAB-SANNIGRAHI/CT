package day11_AM;

public class Connection {
	private static Connection con1;
	private static Connection con2;
	private static Connection con3;
	private static Connection con4;
	private static Connection con5;
	private static Connection con6;
	public static Connection getConnection() {
		if(con1 == null) {
			con1 = new Connection();
			return con1;
		} else if(con2 == null) {
			con2 = new Connection();
			return con2;
		} else if(con3 == null) {
			con3 = new Connection();
			return con3;
		}else if(con4 == null) {
			con4 = new Connection();
			return con4;
		}else if(con5 == null) {
			con5 = new Connection();
			return con5;
		}
		return con6;
	}

	private Connection() {
		
	}
}
