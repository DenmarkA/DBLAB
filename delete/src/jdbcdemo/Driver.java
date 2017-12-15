package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen", "root" , "");
			Statement myStmt = myConn.createStatement();
			String sql = "delete from customers where last_Name = 'Kasilag'";
			int rowsAffected = myStmt.executeUpdate(sql);
			System.out.println("Rows Affected: " + rowsAffected);		
			System.out.println("Delete complete");
			
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
