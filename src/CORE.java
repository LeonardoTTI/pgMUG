package pgMUG;

import java.sql.*;
import java.math.*;

public class Core{

    private static String url;
    private static String username;
    private static String password;

    public static void main(String[] args){
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        url = "jdbc:postgresql:test";
        username = "root";
        password = "";
        try{
        Connection conn = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //DataabaseMetaData md = conn.getMetaData();
        new Gui();
    }
}
