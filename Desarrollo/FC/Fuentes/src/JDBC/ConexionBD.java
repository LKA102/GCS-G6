package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    public static Connection conectar(){
        //String urlConnection = "jdbc:mysql://localhost:3306/dbfollowclass";
        String urlConnection = "jdbc:postgresql://localhost:5432/dbfollowclass";
        String user = "postgres";
        String password = "123456";
        
        try {
            Connection conn = DriverManager.getConnection(urlConnection, user, password);
            //JOptionPane.showMessageDialog(this,"Se ha conectado a la Base de Datos");
            return conn;
        } catch (SQLException e) {
            
            System.err.println("SQLException: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("VendorError: " + e.getErrorCode());
            //JOptionPane.showMessageDialog(null,"Error al conectar a la Base de Datos"+e.toString()); 
            return null;
        }
    }
}
