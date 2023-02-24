import Classes.Book;
import Classes.Dbconnection;
import Classes.User;
import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection con;
        Book b1 = new Book(3,"last of us","me");
        //// List
        try {
            con = Dbconnection.getCon();
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select * from User");
            while (res.next()){
                System.out.println( "nom " + res.getString(2));
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /// insert
        try {
            con = Dbconnection.getCon();
            String query = "insert into Book value (?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,b1.getId());
            st.setString(2,b1.getTitle());
            st.setString(3,b1.getAuthor());
            if (st.executeUpdate()!=0){
                System.out.println("Add succes");;
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Update


        try {
            con = Dbconnection.getCon();
            String query = "update Book set title =? where id=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,b1.getTitle());
            st.setInt(2,b1.getId());
            if (st.executeUpdate()!=0){
                System.out.println("update succes");;
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        /// Delete
        try {
            con = Dbconnection.getCon();
            String query = "delete from Book where id=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,b1.getId());
            if (st.executeUpdate()!=0){
                System.out.println("delete succes");;
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}