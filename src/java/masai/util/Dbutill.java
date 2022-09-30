package java.masai.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutill {

    public static Connection provideConnection(){

        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("problem related loading the driver");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        String url="jdbc:mysql://localhost:3306/web18sb101db";


        try{
            conn= DriverManager.getConnection(url,"root","Deepak@098");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
