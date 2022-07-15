package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    public static Connection conectar(){
        String urlConnection = "jdbc:mysql://localhost:3306/dbfollowclass";
        String user = "root";
        String password = "123456"; // colocar la contraseña
        
        try {
            Connection conn = DriverManager.getConnection(urlConnection, user, password);
            return conn;
        } catch (SQLException e) {
            
            System.err.println("SQLException: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("VendorError: " + e.getErrorCode());
            return null;
        }
    }
}
