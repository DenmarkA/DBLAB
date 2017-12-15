package create;

import java.sql.*;
import java.util.Scanner;

public class Create {

    public static void main(String[] args) throws Exception {
    	Scanner kbd = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");

        String conStr = "jdbc:mysql://localhost:3306/labkoto?user=root&password=";
        Connection con = DriverManager.getConnection(conStr);
        System.out.println("connection done");
        
        rs.first();
        rs.updateString(2, "Apilado");
        rs.updateRow();
        rs.absolute(6);
       // double newpr = rs.getDouble(3) * 1.1;
        //rs.updateDouble("price", newpr);
        rs.updateRow();

        PreparedStatement psu = 
        con.prepareStatement("UPDATE customers SET first_Name = Denver WHERE custId = 1");
        psu.executeUpdate();
        rs = stmt.executeQuery(stSel);
        System.out.println("=========================================");
        rs.beforeFirst();

}


