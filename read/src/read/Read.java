
package read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Read {
 

	 public static void main(String[] args) throws Exception {
	        Class.forName("com.mysql.jdbc.Driver");

	        String conStr = "jdbc:mysql://localhost:3306/labkoto?user=root&password=";
	        Connection con = DriverManager.getConnection(conStr);
	        System.out.println("connection done");

	        String stSel = "SELECT * FROM customers";

	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	                ResultSet.CONCUR_UPDATABLE);
	        ResultSet rs = stmt.executeQuery(stSel);

	        rs.beforeFirst();
	        while (rs.next()) {
	            int custID = rs.getInt(1);
	            String last_Name = rs.getString(2);
	            String first_Name = rs.getString(3);
	            String contact_Num = rs.getString(4);

	            System.out.printf("%3d %-25s %10s %15s \n",custID, last_Name, first_Name,contact_Num);
	        }
	 }
}



