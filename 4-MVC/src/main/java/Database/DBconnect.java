package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    private static final String URL = "jdbc:mysql://localhost:3306/este";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static DBconnect instance = null;
    private static Connection con;
    private DBconnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Done");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static DBconnect GetInstance(){
        if (instance == null) {
            return new DBconnect();
        }
        return instance;
    }

    public static Connection getCon() {
        return con;
    }

}
