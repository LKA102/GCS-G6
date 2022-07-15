package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    public static Connection conectar(){
        /*
        //conexion local mysql
        String urlConnection = "jdbc:mysql://localhost:3306/dbfollowclass";
        String user = "localhost";
        String password = "123456";*/
        
        /*
        //conexion remota heroku-postgres
        String urlConnection = "jdbc:postgresql://ec2-3-219-52-220.compute-1.amazonaws.com:5432/d1bqrln047024d";
        String user = "ublnbtjltkosrh";
        String password = "6533b2c334161da4aaa06a8c73d847a20f01cc4dd9982e82bf06a1c54464e7e4"; // colocar la contraseña*/
        
        //conexion local postgres
        String urlConnection = "jdbc:postgresql://localhost:5432/db_fc";
        String user = "postgres";
        String password = "123456";
        
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
