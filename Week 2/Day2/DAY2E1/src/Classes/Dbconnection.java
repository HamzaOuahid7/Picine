package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbconnection {
    static Connection con;

    public static Connection getCon() {
        try {
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library_db","root","root");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
