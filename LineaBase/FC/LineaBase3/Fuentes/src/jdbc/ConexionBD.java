package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection conectar() throws IOException{
        
        //BD REMOTA
        String urlConnection = "jdbc:postgresql://ec2-3-219-52-220.compute-1.amazonaws.com:5432/d1bqrln047024d";
        String user = "ublnbtjltkosrh";
        Path path = Paths.get("dbremota.txt");
        
        //BD LOCAL
       /* String urlConnection = "jdbc:postgresql://localhost:5432/dbfollowclass";
        String user = "postgres";

        Path path = Paths.get("db.txt");*/

        String password;
        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            password = br.readLine();
            return DriverManager.getConnection(urlConnection, user, password);

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("VendorError: " + e.getErrorCode());
            return null;
        }
    }
}
