package LW_09.Q1;

import java.sql.*;

public class DBC {

    private static Connection con;

    public static Connection getConnection() {
        if (con == null) { // connect only once
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/reg_db", "root", "");
                System.out.println("Database connected!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}
