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
        
        System.out.println("Enter custID in customers: ");
        int cust = kbd.nextInt();
        System.out.println("Enter last_name in customers: ");
        String last = kbd.next();
        System.out.println("Enter first_name in customers: ");
        String first = kbd.next();
        System.out.println("Enter contact_Num in customers: ");
        String contact = kbd.next();
        PreparedStatement psi;
        String del = "DELETE FROM customers where custId = ?";
        psi = con.prepareStatement(del);
        psi.setInt(1, cust);
        psi.executeUpdate();
        
        String stIns = "INSERT INTO customers(custID,last_name,first_name, contact_Num) VALUES (?,?,?,?)";
        psi = con.prepareStatement(stIns);
        psi.setInt(1, cust);
        psi.setString(2, last);
        psi.setString(3, first);
        psi.setString(4, contact);
        psi.executeUpdate();
        
        System.out.print("Insert Successful");

        con.close();
    }
}


