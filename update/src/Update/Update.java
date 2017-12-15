package update;

import java.sql.*;


public class Update {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String conStr = "jdbc:mysql://localhost:3306/labkoto?user=root&password=";
        Connection con = DriverManager.getConnection(conStr);
        System.out.println("connection done");
        String stSel = "SELECT * FROM customers";
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(stSel);
        
        rs.first();
        rs.updateString(2, "Apilado");
        rs.updateRow();

        PreparedStatement psu = 
        con.prepareStatement("UPDATE customers SET first_Name = 'Oreinz' WHERE custId = 1");
        psu.executeUpdate();
        rs = stmt.executeQuery(stSel);
        System.out.println("=========================================");
        rs.beforeFirst();
        rs.close();

}
}


