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
        String urlConnection = "jdbc:mysql://localhost:3306/dbfollowclass";
        String user = "root";

        Path path = Paths.get("db.txt");

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
