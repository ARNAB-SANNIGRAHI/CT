package day11_AM;

public class Connection_Driver {
	
	public static void main(String[] args) {
		
  Connection con1 = Connection.getConnection();
  Connection con2 = Connection.getConnection();
  Connection con3 = Connection.getConnection();
  Connection con4 = Connection.getConnection();
  Connection con5 = Connection.getConnection();
  Connection con6 = Connection.getConnection();
  Connection con7 = Connection.getConnection();

  	System.out.println(con1);
  	System.out.println(con2);
  	System.out.println(con3);
  	System.out.println(con4);
  	System.out.println(con5);
  	System.out.println(con6);
  	System.out.println(con7);
  
}
}