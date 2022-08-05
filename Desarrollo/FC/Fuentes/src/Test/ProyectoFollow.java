 package test;

import jdbc.ConexionBD;
import java.io.IOException;
import vista.principal.Login;

public class ProyectoFollow {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Login abrir=new Login();
        ConexionBD objetoConexion = new ConexionBD();
        objetoConexion.conectar();
        abrir.setVisible(true);
    }
}
