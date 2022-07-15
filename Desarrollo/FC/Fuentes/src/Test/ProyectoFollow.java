package Test;

import JDBC.ConexionBD;
import vista.principal.login;

public class ProyectoFollow {
    public static void main(String[] args) throws ClassNotFoundException {
        login abrir=new login();
        ConexionBD objetoConexion = new ConexionBD();
        objetoConexion.conectar();
        abrir.setVisible(true);
        //abrir.setLocationRelativeTo(null);
    }
    
}
